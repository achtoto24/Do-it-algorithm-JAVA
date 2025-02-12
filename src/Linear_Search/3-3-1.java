////선형 검색 feat.보초법
//import java.util.Scanner;
//
//class SeqSearchSen2 {
//  static int seqSearchSen(int[] a, int n, int key) {
//    int i = 0;
//    a[n] = key;
//
//    for (int j = 0; j < n + 1; j++) {     
//      if (a[j] == key) {
//        i = j;
//        break;
//      }
//    }
//    return i == n ? -1 : i;
//  }
//
//  public static void main(String[] args) {
//    Scanner stdIn = new Scanner(System.in);
//
//    System.out.print("요솟수: ");
//    int num = stdIn.nextInt();
//    int[] x = new int[num + 1];
//
//    for (int i = 0; i < num; i++) {
//      System.out.print("x[" + i + "]: ");
//      x[i] = stdIn.nextInt();
//    }
//
//    System.out.print("검색할 값: ");
//    int ky = stdIn.nextInt();
//    
//    int idx = seqSearchSen(x, num, ky);
////==========================================================================
//    
//    System.out.print("   |  ");
//    for (int i = 0; i < num + 1; i++)
//      System.out.printf("%d  ", i);
//    System.out.println();
//    System.out.print("---+--");
//    for (int i = 0; i < num + 1; i++)
//      System.out.print("----");
//    System.out.println();
//    
//    if (idx == -1)
//      System.out.println("그 값의 요소 x");
//    else
//      System.out.println("그 값은 x[" + idx + "]에 있습니다.");
//  }
//}

// 연습3-2
// 선형검색(검색 과정을 자세히 출력)

import java.util.Scanner;

class SeqSearchEx {

  //--- 배열 a의 앞쪽 n개의 요소에서 key와 일치하는 요소를 선형검색(보초법)---//
  static int seqSearchEx(int[] a, int n, int key) {
    System.out.print("   |");
    for (int k = 0; k < n; k++)
      System.out.printf("%4d", k);
    System.out.println();

    System.out.print("---+");
    for (int k = 0; k < 4 * n + 2; k++)
      System.out.print("-");
    System.out.println();

    for (int i = 0; i < n; i++) {
      System.out.print("   |");
      System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
      System.out.printf("%3d|", i);
      for (int k = 0; k < n; k++)
        System.out.printf("%4d", a[k]);
      System.out.println("\n   |");
      if (a[i] == key)
        return i;					// 검색 성공
    }
    return -1;						// 검색 실패
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("요솟수 : ");
    int num = stdIn.nextInt();
    int[] x = new int[num];		// 요솟수가 num 인 배열 

    for (int i = 0; i < num; i++) {
      System.out.print("x[" + i + "] : ");
      x[i] = stdIn.nextInt();
    }

    System.out.print("검색 값 : ");				// 키값을 입력받음
    int ky = stdIn.nextInt();

    int idx = seqSearchEx(x, num, ky);	// 배열 x에서 값이 ky인 요소를 검색

    if (idx == -1)
      System.out.println("그 값의 요소는 존재하지 않습니다.");
    else
      System.out.println("그 값은 x[" + idx + "]에 있습니다.");
  }
}