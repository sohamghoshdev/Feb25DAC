import java.time.LocalTime;

public class time{
public static void main(String[] args) {
LocalTime checkTime = LocalTime.of(8, 30);
LocalTime morningStart = LocalTime.of(5, 0);  
LocalTime morningEnd = LocalTime.of(12, 0);   
if (!checkTime.isBefore(morningStart) && checkTime.isBefore(morningEnd)) {
System.out.println("Good Morning!");
}
}
}