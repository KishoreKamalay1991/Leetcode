package Thingstocheck;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


// Internally it implements heap Datastructures
public class queueExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);

        List<String> list3 = new ArrayList<>();
        list3.add("acdb");
        list3.add("adbc");
        list3.add("abcd");





        Queue<Integer> myqueue = new PriorityQueue<>();

        Queue<Integer> myqueueNew = new PriorityQueue<>();

        Queue<Integer> customizedQueue = new PriorityQueue<>((a, b) -> b - a);

        Queue<String> stringQueue = new PriorityQueue<>();
        stringQueue.addAll(list3);

        customizedQueue.addAll(list2);


        myqueue.offer(3);
        myqueue.offer(4);
        myqueue.offer(1);
        myqueue.offer(2);

        myqueueNew.addAll(list);

        System.out.println(myqueue);
        System.out.println(myqueueNew);
        while (!customizedQueue.isEmpty()) {
            System.out.print(customizedQueue.poll() + " ");
        }

        while (!stringQueue.isEmpty()) {
            System.out.print(stringQueue.poll() + " ");
        }


    }

}
