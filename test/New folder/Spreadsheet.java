import java.util.*;

class Cell{
	private Object value;
    private DataType dataType;

    public Cell(Object value,DataType dataType) {
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


class SpreadsheetApplication {
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
	
	
	
}


public class Main {
    public static void main(String[] args) {
        SpreadsheetApplication app = new SpreadsheetApplication();
 
        app.createSheet();
        Sheet sheet = app.getSheet(0);

        sheet.addRow();
        sheet.addColumn(DataType.NUMBER);
        sheet.addColumn(DataType.TEXT);
		
		sheet.deleteRow(0);
        sheet.deleteColumn(1);
		
        app.deleteSheet(0);
    }
}

