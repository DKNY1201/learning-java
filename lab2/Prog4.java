package lab2;

public class Prog4 {
	public static void main(String[] args) {
		String recordsData = Data.records;
		
		printRecords(recordsData);
	}
	
	public static void printRecords(String recordsData) {
		String[] records = recordsData.split(":");
		
		for (String record: records) {
			String[] columns = record.split(",");
			System.out.println(columns[0]);
		}
	}
}
