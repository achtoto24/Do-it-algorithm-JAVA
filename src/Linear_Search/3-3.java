//선형 검색 feat.보초법
import java.util.Scanner;

class SeqSearchSen {
  static int seqSearchSen(int[] a, int n, int key) {
    int i = 0;
    a[n] = key;

    for (int j = 0; j < n + 1; j++) {
      if (a[j] == key) {
        i = j;
        break;
      }
    }

    // while (true) {
    // if (a[i] == key)
    // break;
    // i++;
    // }
    return i == n ? -1 : i;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("요솟수: ");
    int num = stdIn.nextInt();
    int[] x = new int[num + 1];

    for (int i = 0; i < num; i++) {
      System.out.print("x[" + i + "]: ");
      x[i] = stdIn.nextInt();
    }

    System.out.print("검색할 값: ");
    int ky = stdIn.nextInt();

    int idx = seqSearchSen(x, num, ky);

    if (idx == -1)
      System.out.println("그 값의 요소 x");
    else
      System.out.println("그 값은 x[" + idx + "]에 있습니다.");
  }
}