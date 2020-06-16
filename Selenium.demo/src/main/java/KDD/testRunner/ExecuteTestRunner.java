package KDD.testRunner;

import KDD.utils.ReusableFunction;

public class ExecuteTestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReusableFunction fun=new ReusableFunction();
		//return string data
		String[][] keywordsData=fun.fetchData();
		int rownum=keywordsData.length;
		int colnum=keywordsData[0].length;					

		String TC_Name=keywordsData[0][0];
		String TC_Step_No=keywordsData[0][1];
		
		String TC_Step_Name=keywordsData[0][2];
		String TC_Function=keywordsData[0][3];
		
		String TC_Location=keywordsData[0][4];
		String TC_LV=keywordsData[0][5];
		String TC_Param=keywordsData[0][6];
		String TC_Execute=keywordsData[0][7];
		
		for(int column=1;colnum<rownum;column++)
		{
			String function=keywordsData[column][3];
			String locatorBy=keywordsData[column][4];
			String locator_Element=keywordsData[column][5];
			String content_Param=keywordsData[column][6];
			String execute=keywordsData[column][7];
			System.out.println(function+"\t"+locatorBy+"\t"+locator_Element+"\t"+content_Param+"\t");
			//method name
			if(execute.equals("Y"))
			{
				switch(function)
				{
				
				case "lauchApp":
					fun.lauchApp();
					break;
				
				case "fillText":
					fun.fillText(locatorBy, locator_Element, content_Param);
					break;
				case "click":
					fun.click(locatorBy,locator_Element);
					break;
				}
			}
			
		}
	}
}