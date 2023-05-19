import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 필요한 자료형을 넣어주세요
        ArrayList<Number> list = new ArrayList<Number>();
        System.out.print("Enter five integers and five doubles: ");

        for(int i=0; i<5; i++){
            list.add(input.nextInt());
        }
        for(int i=0; i<5; i++){
            list.add(input.nextDouble());
        }

        sort(list);

        for(int i=0; i<10; i++){
            System.out.print(list.get(i)+" ");
        }
    }

    public static void sort(List<Number> list) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for(int i=1; i<list.size(); i++) {
                if (list.get(i-1).doubleValue() > list.get(i).doubleValue()) {
                    Number tmp = list.get(i);
                    list.set(i, list.get(i-1));
                    list.set(i-1,tmp);
                    sorted = false;
                }
            }
        }
    }
}
