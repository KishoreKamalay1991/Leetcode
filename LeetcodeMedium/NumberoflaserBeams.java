public class NumberoflaserBeams {
public static int numberOfBeams(String[] bank) {
	int totalNumberofBeams = 0;
	int previousRowDevices = 0;
	for(String row : bank) {
		int currentRowDevices = 0;
		for(int i = 0; i < row.length(); i++) {
			if(row.charAt(i) == '1') {
				currentRowDevices++;
			}
		}
		if(currentRowDevices > 0) {
			totalNumberofBeams = totalNumberofBeams + (previousRowDevices * currentRowDevices);
			previousRowDevices = currentRowDevices;
		}
	}
	return totalNumberofBeams;
}

public static void main(String[] args) {
	String[] bank = {"011001","000000","010100","001000"};
	int result = numberOfBeams(bank);
}

}
