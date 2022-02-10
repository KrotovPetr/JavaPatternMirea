package task1;
import java.util.Scanner;
public class testClass{//класс для отработки
    public testClass(){
       Integer[] arr = new Integer[10];//создаём массив рандомных чисел
       for(int i=0;i<arr.length;i++){
           arr[i]=(int)(Math.random()*10);
       }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"     ");//технический вывод информации для себя
        }
        System.out.print("\n");
        Function<String, Integer> lambda = (Integer[] arr2) -> {//лямбда выражение
            String str="";
            boolean[] flagArr = new boolean[10];//массив флагов
            for(int j=0;j<arr2.length;j++){
                flagArr[arr2[j]]=true;}//проверяем наличие числа
            for(int j=0;j<arr2.length-1;j++){
                for(int k=j+1;k<arr2.length;k++){//сортируем по возрастанию
                    if(arr2[j]<arr2[k]){
                        int x=arr2[k];
                        arr2[k]=arr2[j];
                        arr2[j]=x;
                    }
                }
            }
                if(flagArr[0]){//если есть ноль
                    for(int i=1;i<flagArr.length;i++){
                        if(flagArr[i]){
                            str+=i;
                            flagArr[i]=false;
                            break;
                        }
                    }
                }
                for(int i=0;i<flagArr.length;i++){//если нет нуля+ остальные случаи
                    if(flagArr[i]) {
                        str += i;
                    }
                }


            return str;
        };

        System.out.println(lambda.makeString(arr));//вызов функции
    }

}
