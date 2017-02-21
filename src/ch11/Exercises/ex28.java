package ch11.Exercises;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * Exercise-11.28
 * @author LuckyGong
 *
 */
public class ex28 {
	public static void main(String[] args) {
		Random rand = new Random();
		PriorityQueue<Double> pq = new PriorityQueue<Double>();
		for(int i = 0;i < 10;i++)
			pq.offer(rand.nextDouble());
		for(int i = 0;i < 10;i++)
			System.out.println(pq.poll());
	}
}
