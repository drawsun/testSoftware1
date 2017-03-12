package src;

public class Trianglejudge {
	public int getTriangle(int a,int b,int c){
		int TriangleKind = 3;
		if(a!=0&&b!=0&&c!=0){
			if(a==b&&b==c){
				TriangleKind = 0;
				return TriangleKind;
			}else if(a==b||b==c||a==c){
				TriangleKind = 1;
				return TriangleKind;
			}else{
				TriangleKind = 2;
				return TriangleKind;
			}
		}
		return TriangleKind;
	}
}
