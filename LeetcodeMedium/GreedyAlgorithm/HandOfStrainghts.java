package GreedyAlgorithm;

import java.util.TreeMap;

public class HandOfStrainghts {

  public static boolean handofStringhts(int[] hands, int groupSize) {
	  
	  if(hands.length % groupSize != 0) {
		  return false;
	  }
	  
	  TreeMap<Integer, Integer> map = new TreeMap<>();
	  
	  for(int card : hands) {
		  if(map.containsKey(card)) {
			  map.put(card, map.get(card) + 1);
		  } else {
			  map.put(card, 1);
		  }
	  }
	  
	  while(!map.isEmpty()) {
		int first = map.firstKey();
		for(int i = 0; i < groupSize; i++) {
			 int currentCard = first + i;
			 if(!map.containsKey(currentCard)) {
				 return false;
			 }
			 int count = map.get(currentCard);
			 if(count == 1) {
				 map.remove(currentCard);
			 } else {
				 map.put(currentCard, map.get(currentCard) - 1);
			 }
			 
		}
	  }
	  
	  
	  
	 return true;
  }

  public static void main(String[] args) {
	  
	  int[] hand = {1,2,3,6,2,3,4,7,8};
	  int groupSize = 3;
	  
	  Boolean result = handofStringhts(hand, groupSize);
	 
  }

}
