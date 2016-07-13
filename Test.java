import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Test
{
	public static void main(String[] args) throws IOException
	{
		Random rnd = new Random();
		String []values = {"A12345","B98765","C11111","D99999","E15975"};
		String value = "";
		String path = "C:\\XML\\SystemFix\\Red\\";
		String filename = "";

		for (int i=0; i<100; i++)
		{
			filename = "5b72c025-c8e9-45eb-940f-7f4909cfe" + String.format("%03d", i) + ".txt";
			File file = new File(path + filename);
			file.createNewFile();
			FileWriter writer = new FileWriter(file);
			value = values[rnd.nextInt(values.length)];
			writer.write("<doc>\n    <field>Source</field>\n    <value>" + value + "</value>\n</doc>");
			writer.flush();
			writer.close();
		}
	}
}
