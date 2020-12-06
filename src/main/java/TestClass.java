
public class TestClass {
	
	public static void main(String[] args) {
		
		
		Triangle tri1 = new Triangle(5, 5, 5);
	    Triangle tri2 = new Triangle(3, 5, 4);
	    
	    GeometricObject geo = tri2;
	    
	    //System.out.println(geo.getPerimeter());
	    
	    tri2.setColor("blue");
	    
	    //System.out.println(geo.getArea());
	    
	    RegularPolygon pol1 = new RegularPolygon(6, 4);
	      RegularPolygon pol2 = new RegularPolygon(10, 4, 5.6, 7.8);
	      GeometricObject obj2 = new Rectangle();
	      GeometricObject obj3 = new Circle();
	      
	      geo = pol2;
	      
	      BucketOfObjects bucket = new BucketOfObjects();
	      
	      bucket.addObject((GeometricObject) tri1);
	      bucket.addObject((GeometricObject) pol1);
	      bucket.addObject(obj2);
	      bucket.addObject(geo);
	      bucket.addObject(new Circle());      
	      bucket.addObject((GeometricObject) tri2);
	      bucket.addObject((GeometricObject) pol2);
	    
	      System.out.println(bucket.toString());
	      
	      System.out.println(bucket.getTotalPerimeter());
	    
	    
	}

}
