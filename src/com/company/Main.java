package com.company;
class Point{
    private float x = 0.0f;
    private float y = 0.0f;
    public Point(){}
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    public void setX(float x){
        this.x = x;
    }
    public float getX(){
        return x;
    }
    public void setY(float y){
        this.y = y;
    }
    public float getY(){
        return y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] array = new float[2];
        array[0]=x;
        array[1]=y;
        return array;
    }
    public String toString(){
        return "( x="+getX()+",y="+getY()+")";
    }
}
class MovablePoint extends Point{
        private float xSpeed = 0.0f;
        private float ySpeed = 0.0f;
        private float[] array;
        public MovablePoint(){}
        public MovablePoint(float xSpeed,float ySpeed){
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }
        public MovablePoint(float xSpeed,float ySpeed, float x, float y){
            super(x,y);
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }
        public void setXSpeed(float xSpeed){
            this.xSpeed = xSpeed;
        }
        public float getXSpeed(){
            return xSpeed;
        }
        public void setYSpeed(float ySpeed){
            this.ySpeed = ySpeed;
        }
        public float getYSpeed(){
            return ySpeed;
        }
        public void setSpeed(float xSpeed,float ySpeed){
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }
        public float[] getSpeed(){
            array = new float[2];
            array[0]=xSpeed;
            array[1]=ySpeed;
            return array;
        }
        public MovablePoint move(){
            super.setX(super.getX()+xSpeed);
            super.setY(super.getY()+ySpeed);
            return this;
        }
        @Override
        public String toString(){
            return"(x="+getX()+",y="+getY()+"),speed =(xSpeed ="+getXSpeed()+",ySpeed="+getYSpeed()+")";
        }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Point point = new Point();
        System.out.println(point);
        point = new MovablePoint();
        System.out.println(point);
        point = new MovablePoint(2,4,5,6);
        System.out.println(point);
        ((MovablePoint) point).move();
        System.out.println(point);
    }
}
