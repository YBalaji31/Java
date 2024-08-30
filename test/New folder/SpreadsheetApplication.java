/*class sheet{
int row;
int col;
ArrayList<ArrayList<String>>sheet=new ArrayList<>();


}
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

// Enum for data types
enum DataType {
    NUMBER, TEXT, DATE
}

// Cell class
class Cell {
    private Object value;
    private DataType dataType;

    public Cell(Object value, DataType dataType) {
        this.value = value;
        this.dataType = dataType;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }
}

// Row class
class Row {
    private List<Cell> cells = new ArrayList<>();

    public void addCell(Cell cell) {
        cells.add(cell);
    }

    public void deleteCell(int index) {
        if (index >= 0 && index < cells.size()) {
            cells.remove(index);
        }
    }

    public Cell getCell(int index) {
        if (index >= 0 && index < cells.size()) {
            return cells.get(index);
        }
        throw new IndexOutOfBoundsException("Cell index out of range");
    }

    public List<Cell> getCells() {
        return cells;
    }
}

// Column class
class Column {
    private List<Cell> cells = new ArrayList<>();
    private DataType dataType;

    public Column(DataType dataType) {
        this.dataType = dataType;
    }

    public void addCell(Cell cell) {
        cell.setDataType(dataType);
        cells.add(cell);
    }

    public void updateDataType(DataType dataType) {
        this.dataType = dataType;
        for (Cell cell : cells) {
            cell.setDataType(dataType);
        }
    }

    public void deleteCell(int index) {
        if (index >= 0 && index < cells.size()) {
            cells.remove(index);
        }
    }

    public List<Cell> getCells() {
        return cells;
    }

    public DataType getDataType() {
        return dataType;
    }
}

// Sheet class
class Sheet {
    private List<Row> rows = new ArrayList<>();
    private List<Column> columns = new ArrayList<>();

    public void addRow() {
        rows.add(new Row());
    }

    public void addColumn(DataType dataType) {
        columns.add(new Column(dataType));
        for (Row row : rows) {
            row.addCell(new Cell(null, dataType));
        }
    }

    public void updateData(int rowIndex, int colIndex, Object value) {
        if (rowIndex >= 0 && rowIndex < rows.size() && colIndex >= 0 && colIndex < columns.size()) {
            Cell cell = rows.get(rowIndex).getCell(colIndex);
            cell.setValue(value);
        } else {
            throw new IndexOutOfBoundsException("Row or column index out of range");
        }
    }

    public void updateColumnType(int colIndex, DataType dataType) {
        if (colIndex >= 0 && colIndex < columns.size()) {
            columns.get(colIndex).updateDataType(dataType);
        } else {
            throw new IndexOutOfBoundsException("Column index out of range");
        }
    }

    public void applySort(int colIndex) {
        if (colIndex >= 0 && colIndex < columns.size()) {
            final int index = colIndex;
            Collections.sort(rows, new Comparator<Row>() {
                @Override
                public int compare(Row r1, Row r2) {
                    Cell cell1 = r1.getCell(index);
                    Cell cell2 = r2.getCell(index);

                    if (cell1.getValue() instanceof Comparable && cell2.getValue() instanceof Comparable) {
                        return ((Comparable) cell1.getValue()).compareTo(cell2.getValue());
                    }
                    return 0;
                }
            });
        } else {
            throw new IndexOutOfBoundsException("Column index out of range");
        }
    }

    public void applyFilter(int colIndex, Predicate<Object> condition) {
        if (colIndex >= 0 && colIndex < columns.size()) {
            rows.removeIf(row -> !condition.test(row.getCell(colIndex).getValue()));
        } else {
            throw new IndexOutOfBoundsException("Column index out of range");
        }
    }

    public void deleteRow(int index) {
        if (index >= 0 && index < rows.size()) {
            rows.remove(index);
        }
    }

    public void deleteColumn(int index) {
        if (index >= 0 && index < columns.size()) {
            columns.remove(index);
            for (Row row : rows) {
                row.deleteCell(index);
            }
        }
    }

    public List<Row> getRows() {
        return rows;
    }

    public List<Column> getColumns() {
        return columns;
    }
}

// SpreadsheetApplication class
class SpreadSheet{
    private List<Sheet> sheets = new ArrayList<>();

    public void createSheet() {
        sheets.add(new Sheet());
    }

    public void deleteSheet(int index) {
        if (index >= 0 && index < sheets.size()) {
            sheets.remove(index);
        }
    }

    public Sheet getSheet(int index) {
        if (index >= 0 && index < sheets.size()) {
            return sheets.get(index);
        }
        throw new IndexOutOfBoundsException("Sheet index out of range");
    }

    public List<Sheet> getSheets() {
        return sheets;
    }
	
	
	public class Main {
    public static void main(String[] args) {
        SpreadsheetApplication app = new SpreadsheetApplication();

        // Create a new sheet
        app.createSheet();
        Sheet sheet = app.getSheet(0);

        // Add rows and columns
        sheet.addRow();
        sheet.addColumn(DataType.NUMBER);
        sheet.addColumn(DataType.TEXT);

        // Update data
        sheet.updateData(0, 0, 123);
        sheet.updateData(0, 1, "Sample Text");

        // Change column type
        sheet.updateColumnType(1, DataType.NUMBER);

        // Apply sort and filter
        sheet.applySort(0);
        sheet.applyFilter(1, value -> (int) value > 100);

        // Delete row and column
        sheet.deleteRow(0);
        sheet.deleteColumn(1);

        // Delete sheet
        app.deleteSheet(0);
    }
}

}
