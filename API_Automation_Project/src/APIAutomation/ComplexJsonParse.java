package APIAutomation;

import Files.Payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int totalcalAmount = 0;		
		JsonPath js = new JsonPath(Payload.CoursePrice());
		// Print No of courses returned by API
		int count= js.getInt("courses.size()");
		System.out.println(count);
		// Print Purchase Amount
		int totalAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println(totalAmount);
		//Print Title of the first Course
		String firstCourseTitle = js.get("courses[0].title");
		System.out.println(firstCourseTitle);
		
		//Print all Course title & their price
		
		for(int i=0;i<count; i++) 
		{
			String title = js.get("courses["+i+"].title");
			System.out.print("Course Title: "+title+" ");
			int price = js.get("courses["+i+"].price");
			System.out.println("Price: "+ price);
			
			//Print no of copies sold by course RPA
			if(title.equals("RPA")) {
				 int copies = js.get("courses["+i+"].copies");
				 System.out.println("No of RPA copies sold: " +copies);
			}
			
			//Verify Sum of all course price matches the Total purchase amount
			
			System.out.println("*****Total price of course as per copies purchased ******");
			int copies = js.get("courses["+i+"].copies");
			int totalCoursePrice = price*copies;
			System.out.println("Sum of total copies purchased for " +title+ ": "+totalCoursePrice);
			
			totalcalAmount= totalcalAmount + totalCoursePrice;
			System.out.println("Total Amount of all course purchase: "+totalcalAmount);
			if(totalAmount == totalcalAmount) 
			{
				System.out.println("Puchase amount matches with the total Calculate amount of courses");
			}
			
			
			
			
		}
		
	}

}
