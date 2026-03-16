package com.Pioneak.Review1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import java.util.stream.Collectors;

public class LambdaStream {



    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();

        Random random = new Random();
        for(int i = 0;i<10;i++)
        {
            list.add(random.nextInt(100) + 1);
        }
        List<Integer> collectJudge = list.stream().filter(collector->{
            return collector % 2 == 1;
        }).collect(Collectors.toList());

        collectJudge.forEach(System.out::println);

        Collection<String> collectFunction = list.stream().map(collector -> {
            return "幸运号码" + collector;
        }).collect(Collectors.toList());
        collectFunction.forEach(System.out::println);

        list.stream().forEach(num->{
            System.out.println("流水线来了元素 具体操作：吞了" + num);
        });
    }



}
