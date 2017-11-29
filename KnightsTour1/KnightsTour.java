/**
 * Write a description of class KnightsTour here.
 *
 * @author Jasper Hendra
 * @version 11/28/17
 */
public class KnightsTour
{
    static int iMove = 0;
    //static int arr[][] = new int[8][8]
    static int arr[][] = new int[9][9];
    public static void empty(){
        iMove = 0;
        for (int r = 0; r < 9; r++){
            for(int c = 0; c < 9; c++){
                arr[r][c] = 0;
                arr[r][0] = r;
                arr[0][c] = c;
            }
        }
    }
    public static void main(){
        empty();
        iMove = 1;
        move(1,1);
        for (int r = 0; r < 9; r++){
            for(int c = 0; c < 9; c++){
                String s = "" + arr[c][r];
                if(arr[c][r] < 10) s = " " + s;
                s = "  " + s;
                System.out.print(s);
            }
            System.out.println("");
        }
        System.out.println(iMove + " squares were visited");
    }
    public static void move(int X, int Y){
        arr[X][Y] = iMove;
        String sArr[] = new String[7];
        int iCnt = 0;
        if (isValid(X-2, Y+1)){
            sArr[iCnt] = "" + (X-2) + " " + (Y+1);
            iCnt++;
        }
        if (isValid(X-2, Y-1)){
            sArr[iCnt] = "" + (X-2) + " " + (Y-1);
            iCnt++;
        }
        if (isValid(X+2, Y+1)){
            sArr[iCnt] = "" + (X+2) + " " + (Y+1);
            iCnt++;
        }
        if (isValid(X+2, Y-1)){
            sArr[iCnt] = "" + (X+2) + " " + (Y-1);
            iCnt++;
        }
        if (isValid(X-1, Y+2)){
            sArr[iCnt] = "" + (X-1) + " " + (Y+2);
            iCnt++;
        }
        if (isValid(X-1, Y-2)){
            sArr[iCnt] = "" + (X-1) + " " + (Y-2);
            iCnt++;
        }
        if (isValid(X+1, Y+2)){
            sArr[iCnt] = "" + (X+1) + " " + (Y+2);
            iCnt++;
        }
        if (isValid(X+1, Y-2)){
            sArr[iCnt] = "" + (X+1) + " " + (Y-2);
            iCnt++;
        }
        if (iCnt == 0)return;
        int iRandom = (int)(Math.random() * iCnt);
        //System.out.println("sArr: " + sArr[iRandom]);
        int newX = Integer.parseInt(sArr[iRandom].substring(0,1));
        int newY = Integer.parseInt(sArr[iRandom].substring(2,3));
        iMove++;
        move(newX, newY);
    }
    private static boolean isValid(int X, int Y){
        if (X < 1)return false;
        if (Y < 1)return false;
        if (X > 8)return false;
        if (Y > 8)return false;
        if (arr[X][Y] > 0)return false;
        return true;
    }
}
