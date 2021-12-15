class Area1{
	int length;
	int breadth;
    Area1(){
    
    }
   /* Area1(int length,int breadth){
    length=newlength;
    breadth=newbreadth;
     }*/
   public void setLength(int newlength){
        length=newlength;
    }
   public void setBreadth(int newbreadth){
        breadth=newbreadth;
    }
    int getLength(){
    return length;
    }
    int getBreadth(){
    return breadth;
    }
    public int getArea(){
    int area=length*breadth;
    return area;
    }
}