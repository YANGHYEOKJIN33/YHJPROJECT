
public class Class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class AirCon{
			String company;
			String color;
			int price;
			int size;
			int temp;
			
			void powerOn()
			{
				System.out.println("power on");
			}
			void powerOff()
			{
				System.out.println("power off");
			}
			void tempUp()
			{
				temp++;
			}
			void tempDown()
			{
				temp--;
			}
		}
		AirCon airCon1 = new AirCon();
		
		airCon1.color = "White";
		airCon1.temp = 10;
		airCon1.price = 10000;
		
		airCon1.tempUp();
		System.out.printf("airCon1의 색강 : %s, 현재 기온 : %d, 가격 : %d\n"
				, airCon1.color, airCon1.temp, airCon1.price);
		
		airCon1.tempDown();
		System.out.printf("airCon1의 색강 : %s, 현재 기온 : %d, 가격 : %d\n"
				, airCon1.color, airCon1.temp, airCon1.price);
	}

}
