package driver_script;
import java.lang.reflect.Method;

import config.UIActionKeywords;
import utility.KeyWordExcel;
public class ScriptExecutorReflection 
{
	public static UIActionKeywords actionKeywords;
	public static String sActionKeyword;
	public static Method method[];
	public ScriptExecutorReflection() throws Exception
	{
		actionKeywords = new UIActionKeywords();
		method = actionKeywords.getClass().getMethods();
	}
	private void execute_Actions() throws Exception
	{
		
		for(int i = 0;i<method.length;i++)
		{
			if(method[i].getName().equals(sActionKeyword))
			{
				method[i].invoke(actionKeywords);
				break;
			}
		}
		
	}	

	public static void main(String[] args) throws Exception 
	{
		ScriptExecutorReflection sr = new ScriptExecutorReflection();
		String path = "D:\\Selenium\\KeywordDriven.xlsx";
		KeyWordExcel.setExcelFile(path, "Sheet1");
		for(int iRow = 1;iRow<=7;iRow++)
		{
			sActionKeyword = KeyWordExcel.getCellData(iRow, 3);
			sr.execute_Actions();
		}
		
	}

}







