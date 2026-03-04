import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		char [] s={'h','e','l','l','o'};
		int n=s.length-1;
		char a;
		for(int i=0;i<=(n/2);i++){
			a=s[i];
			s[i]=s[n-i];
			s[n-i]=a;
		}
		System.out.println(Arrays.toString(s));
			
	}
}