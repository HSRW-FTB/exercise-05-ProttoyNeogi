
public  class BucketOfObjects {
	
	private GeometricObject[] items=new GeometricObject[7];
	
	private int i=0;
	
	
	public BucketOfObjects() {
		
		
	}
	
	public void addObject(GeometricObject go) {
		
		if(i<items.length) {
			
			items[i]=go;
			i++;
		}
		
		
	}
	
	public double getTotalArea() {
		
		double a=0;
		
		for(int i=0;i<items.length;i++) {
			
			a=a+items[i].getArea();	
			
		}
		
		return a;
	}
	
	public double getTotalPerimeter() {
		
		double a=0;
		
		for(int i=0;i<items.length;i++) {
			
			a=a+items[i].getPerimeter();	
			
		}
		
		return a;
	}

	public String toString() {
		
		String a="";		
		for(int i=0;i<items.length;i++) {
		
		//a=a+String.valueOf(items[i]);
			
			a=a+items[i].getClass().getName()+",";
			
		}
		
		return a;
	
	
}
}
