import java.util.Scanner;

class HeapSort {
  static void swap(int[] a, int idx1, int idx2) {
    int t = a[idx1];
    a[idx1] = a[idx2];
    a[idx2] = t;
  }

  static void downHeap(int[] a, int left, int right) {
    int temp = a[left];
    int child;
    int parent;

    for (parent = left; parent < (right + 1) / 2; parent = child) {
      int cl = parent * 2 + 1;
      int cr = cl + 1;
      child = (cr <= right && a[cr] > a[cl]) ? cr : cl;
      if (temp >= a[child])
        break;
      a[parent] = a[child];
    }
    a[parent] = temp;
  }

  static void heapSort(int[] a, int n) {
    for (int i = (n - 1) / 2; i >= 0; i--)
      downHeap(a, i, n - 1); // 배열 초기 상태를 힙으로 만들기
    for (int i = n - 1; i > 0; i--) {
      swap(a, 0, i); // 힙의 최대값을 배열의 끝에 있는 값과 교환
      downHeap(a, 0, i - 1); // 맨뒤 값을 제외한 배열을 힙으로 만들기
    }
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("힙 정렬");
    System.out.print("요솟수 : ");
    int nx = stdIn.nextInt();
    int[] x = new int[nx];

    for (int i = 0; i < nx; i++) {
      System.out.print("x[" + i + "] : ");
      x[i] = stdIn.nextInt();
    }

    heapSort(x, nx);

    System.out.println("오름차순으로 정렬했습니다.");
    for (int i = 0; i < nx; i++)
      System.out.println("x[" + i + "]=" + x[i]);
  }
}