package com.company;

public class Rectangle {
        private double height;
        private double width;
        private Point topLeftPoint;

        public  Rectangle(double height,double width,Point topLeftPoint ){
            this.height = height;
            this.width = width;
            this.topLeftPoint = topLeftPoint;
        }
        public double getHeight() {
            return height;
        }
        public double getWidth() {
            return width;
        }
        public  Point getTopLeftPoint() {
            return topLeftPoint;
        }
        public void setHeight(double height) {
            this.height=height;
        }
        public void setWidth(double width) {
            this.width =width;
        }
    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }
        public void setwidthheighttopLeftPoint(double height,double width,Point topLeftPoint) {
            this.height=height;
            this.width=width;
            this.topLeftPoint=topLeftPoint;
        }
        public double area(){
            return height * width;
        }
        public  double perimeter(){
            return 2 * (width + height);
        }
        public boolean containsPoint(Point point){
            Point topRightPoint = new Point(topLeftPoint.getX() +  width,topLeftPoint.getY());
            Point bottomLeftPoint = new Point(topLeftPoint.getX(),topLeftPoint.getY() - height);
            Point bottomRightPoint = new Point(topLeftPoint.getX() +  width,topLeftPoint.getY()- height);

            if (point.getX() >= topLeftPoint.getX() && point.getX() <= topRightPoint.getX()
                    && point.getY() <= topLeftPoint.getY() && point.getY() >= bottomLeftPoint.getY()){
                return true;
            }else {
                return false;
            }

        }


}
