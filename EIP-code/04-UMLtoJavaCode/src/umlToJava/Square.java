package umlToJava;

class Square {
    private double sideLength;
    private String lineColor;
    private String areaColor;

    public Square(){};
    public Square(double sideLength){
        this.sideLength = sideLength;
    }
    public Square(double sideLength, String lineColor, String areaColor ){
        this.sideLength = sideLength;
        this.lineColor = lineColor;
        this.areaColor = areaColor;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setLineColor(String lineColor) {
        this.lineColor = lineColor;
    }

    public String getLineColor() {
        return lineColor;
    }

    public void setAreaColor(String areaColor) {
        this.areaColor = areaColor;
    }

    public String getAreaColor() {
        return areaColor;
    }
}
