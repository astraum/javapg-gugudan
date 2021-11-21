public class MultipleOf {
    private int baseNumber;
    private int tableSize;
    private int[] multiples;

    public MultipleOf(int baseNumber, int tableSize) {
        if (baseNumber >= 2 && baseNumber <= 9 && tableSize > 0) {
            this.baseNumber = baseNumber;
            this.tableSize = tableSize;
            this.multiples = new int[tableSize];
            for (int i = 0; i < multiples.length; i++) {
                this.multiples[i] = baseNumber * (i+1);
            }
        } else if (baseNumber < 2 || baseNumber > 9) {
            System.out.println("구구단 단수는 2 이상, 9 이하의 자연수만 입력할 수 있습니다.");
        } else if (tableSize < 0) {
            System.out.println("구구단 행수는 자연수만 입력할 수 있습니다.");
        } else {
            System.out.println("무언가 잘못되었습니다. 이 컴퓨터는 3초 뒤 폭발합니다.");
        }

    }

    public void printMultiples() {
        System.out.println("구구단 " + baseNumber + "단, 곱하기 " + tableSize + "까지");
        for (int i = 0; i < multiples.length; i++) {
            System.out.println(baseNumber + " x " + (i+1) + " = " + multiples[i]);
        }
    }

}
