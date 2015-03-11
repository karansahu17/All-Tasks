package assignment.arraytable;

public class ArrayTables {

	public static void main(String[] args) {
		int table[][] = new int[10][10];

		System.out.println("Table size: " +table.length);
		for (int i = 0; i < table.length; i++) {
			table[0][i]= (i+1)*2;
			table[1][i]= (i+1)*3;
			table[2][i]= (i+1)*4;
			table[3][i]= (i+1)*5;
			table[4][i]= (i+1)*6;
			table[5][i]= (i+1)*7;
			table[6][i]= (i+1)*8;
			table[7][i]= (i+1)*9;
			table[8][i]= (i+1)*10;
		}

		for (int i = 0; i < table.length; i++) {
			System.out.print(table[0][i]);
			System.out.print("\t"+table[1][i]);
			System.out.print("\t"+table[2][i]);
			System.out.print("\t"+table[3][i]);
			System.out.print("\t"+table[4][i]);
			System.out.print("\t"+table[5][i]);
			System.out.print("\t"+table[6][i]);
			System.out.print("\t"+table[7][i]);
			System.out.println("\t"+table[8][i]);

		}
	}

}
