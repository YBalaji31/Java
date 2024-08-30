package com.google;
public class AreaOfSquare{

int side;
int area;
public AreaOfSquare(int side){
this.side=side;
}

public void display(){
area=side*side;
System.out.println("Area  of side "+side+ " Square is "+area);
}

}


