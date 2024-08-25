package com.programmingskils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BaseballGame {
    public static int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        int result = 0;
        for (String op : operations) {
            try {
                int i = Integer.parseInt(op);
                list.add(i);
            } catch (Exception e) {
                if(list.size() >= 2) {
                    if(op.equals("+")) {
                        int sum = list.get(list.size()-1) + list.get(list.size()-2);
                        list.add(sum);
                    }
                }
                if(list.size() >= 1) {
                    if(op.equals("D")) {
                        int mul = list.get(list.size()-1) * 2;
                        list.add(mul);
                    }
                    if(op.equals("C")) {
                        list.remove(list.size()-1);
                    }
                }
            }
        }

        for(Integer i : list) {
            result = result + i;
        }
        return result;

//        Stack<Integer> stack = new Stack<>();  //solution : 2
//
//        for (String op : ops) {
//            if (op.equals("C")) {
//                stack.pop();
//            } else if (op.equals("D")) {
//                stack.push(2 * stack.peek());
//            } else if (op.equals("+")) {
//                int top = stack.pop();
//                int newScore = top + stack.peek();
//                stack.push(top);
//                stack.push(newScore);
//            } else {
//                stack.push(Integer.parseInt(op));
//            }
//        }
//
//        int sum = 0;
//        for (int score : stack) {
//            sum += score;
//        }
//
//        return sum;
    }

    public static void main(String[] args) {
        String[] op = {"5","-2","4","C","D","9","+","+"};
        System.out.println(BaseballGame.calPoints(op));
    }
}
