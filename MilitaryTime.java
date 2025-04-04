package classAssignments;

public class MilitaryTime {

	public static void main(String[] args) {
		final int TABLE_BEGIN = 0;
        final int TABLE_END = 23;
        final int TABLE_STEP = 1;

        int time;
        int militaryTime;

        System.out.println("TIME CONVERSION");
        System.out.println("----------------");
        System.out.println("Military     Standard");
        for(militaryTime = TABLE_BEGIN; militaryTime <= TABLE_END; militaryTime += TABLE_STEP){
            time = convertFromMilitaryTime(militaryTime);
            System.out.printf("%6d", militaryTime);
            System.out.printf("%14d\n", time);
        }
    }

    public static int convertFromMilitaryTime(int t)
    {
        if(t == 0){
            return 12;
        }
        else if(t > 0 && t < 13){
            return t;
        }
        else if(t >= 13 && t <= 23){
            return t-12;
        }
        else{
            throw new IllegalArgumentException("Invalid military time");
        }
	}
}
