package lab6.bai3;

class Point3D extends Point2D {
    private float z;
    public Point3D(){
        super();
        this.z = 0.0f;
    }
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }
    public float getZ(){
        return this.z;
    }
    public void setZ(float z){
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[] {super.x,super.y,this.z};
    }
    public void setXYZ(float x, float y,float z){
        this.x = x;
        this.y = y;
        this.x = x;
    }
    @Override
    public String toString(){
        return "Point3D[" + getZ() + "," + getX() + "," + getY() + "," + getXYZ()+"]";
    }
}
