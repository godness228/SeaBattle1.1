public class Destroyer extends Ships {
    int destroyerSize = 2;
    static int counter = 0;

    Ships ships;

    @Override
    public int placeOnField() {
        counter++;
        if (counter == 10) return counter;

        int column;
        int row;
        column = (int) (Math.random() * 10);
        row = (int) (Math.random() * 10);

        ships = new Ships();

        System.out.println("Random column " + column);
        System.out.println("Random row " + row);

        int randomIncreaseDirection = (int) (Math.random()*4); //TODO: дописать к каждому рандомную наразиванию корабля форбидден координаты, дополнить методы наращивания
        //int randomIncreaseDirection = 3;

        System.out.println("Direction of increasing a ship is " + randomIncreaseDirection);

        switch (randomIncreaseDirection) {
            case (0): // left
                System.out.println("case 0");
                if ((column - 1) < 0) {
                    System.out.println("Try again");
                    placeOnField();
                } else {
                    decreasingColumn(column, row);

                    String forbiddenCoordinate_1 = (shipsCoordinates[0] - 1) + "" + shipsCoordinates[1];
                    String forbiddenCoordinate_2 = (shipsCoordinates[0] - 1) + "" + (shipsCoordinates[1] - 1);
                    String forbiddenCoordinate_3 = (shipsCoordinates[0]) + "" + (shipsCoordinates[0] - 1);
                    String forbiddenCoordinate_4 = (shipsCoordinates[0] + 1) + "" + (shipsCoordinates[1] - 1);
                    String forbiddenCoordinate_5 = (shipsCoordinates[0] + 2) + "" + (shipsCoordinates[0] - 1);
                    String forbiddenCoordinate_6 = (shipsCoordinates[0] + 1) + "" + (shipsCoordinates[0]);
                    String forbiddenCoordinate_7 = (shipsCoordinates[0] + 2) + "" + (shipsCoordinates[0] + 1);
                    String forbiddenCoordinate_8 = (shipsCoordinates[0] + 1) + "" + (shipsCoordinates[0] + 1);
                    String forbiddenCoordinate_9 = (shipsCoordinates[0]) + "" + (shipsCoordinates[0] + 1);
                    String forbiddenCoordinate_10 = (shipsCoordinates[0] - 1) + "" + (shipsCoordinates[0] + 1);

                    ships.forbiddenCoordinates.add(forbiddenCoordinate_1);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_2);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_3);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_4);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_5);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_6);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_7);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_8);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_9);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_10);
                }
                break;
            case (1): // down
                System.out.println("case 1");
                if ((row + 1) > 9) {
                    System.out.println("Try again");
                    placeOnField();
                } else {
                    increasingRow(column, row);

                    String forbiddenCoordinate_1 = (shipsCoordinates[0]) + "" + (shipsCoordinates[1] -1);
                    String forbiddenCoordinate_2 = (shipsCoordinates[0] + 1) + "" + (shipsCoordinates[1] - 1);
                    String forbiddenCoordinate_3 = (shipsCoordinates[0] + 1) + "" + (shipsCoordinates[0]);
                    String forbiddenCoordinate_4 = (shipsCoordinates[0] + 1) + "" + (shipsCoordinates[1] + 1);
                    String forbiddenCoordinate_5 = (shipsCoordinates[0] + 1) + "" + (shipsCoordinates[0] + 2);
                    String forbiddenCoordinate_6 = (shipsCoordinates[0]) + "" + (shipsCoordinates[0] + 2);
                    String forbiddenCoordinate_7 = (shipsCoordinates[0] - 1) + "" + (shipsCoordinates[0] + 2);
                    String forbiddenCoordinate_8 = (shipsCoordinates[0] - 1) + "" + (shipsCoordinates[0] + 1);
                    String forbiddenCoordinate_9 = (shipsCoordinates[0] - 1) + "" + (shipsCoordinates[0]);
                    String forbiddenCoordinate_10 = (shipsCoordinates[0] - 1) + "" + (shipsCoordinates[0] - 1);

                    ships.forbiddenCoordinates.add(forbiddenCoordinate_1);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_2);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_3);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_4);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_5);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_6);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_7);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_8);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_9);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_10);
                }
            break;
            case (2): // up
                System.out.println("case 2");
                if ((row - 1) < 0) {
                    System.out.println("Try again");
                    placeOnField();
                } else {
                    decreasingRow(column, row);

                    String forbiddenCoordinate_1 = (shipsCoordinates[0]) + "" + (shipsCoordinates[1] -1);
                    String forbiddenCoordinate_2 = (shipsCoordinates[0] + 1) + "" + (shipsCoordinates[1] - 1);
                    String forbiddenCoordinate_3 = (shipsCoordinates[0] + 1) + "" + (shipsCoordinates[0]);
                    String forbiddenCoordinate_4 = (shipsCoordinates[0] + 1) + "" + (shipsCoordinates[1] + 1);
                    String forbiddenCoordinate_5 = (shipsCoordinates[0] + 1) + "" + (shipsCoordinates[0] + 2);
                    String forbiddenCoordinate_6 = (shipsCoordinates[0]) + "" + (shipsCoordinates[0] + 2);
                    String forbiddenCoordinate_7 = (shipsCoordinates[0] - 1) + "" + (shipsCoordinates[0] + 2);
                    String forbiddenCoordinate_8 = (shipsCoordinates[0] - 1) + "" + (shipsCoordinates[0] + 1);
                    String forbiddenCoordinate_9 = (shipsCoordinates[0] - 1) + "" + (shipsCoordinates[0]);
                    String forbiddenCoordinate_10 = (shipsCoordinates[0] - 1) + "" + (shipsCoordinates[0] - 1);

                    ships.forbiddenCoordinates.add(forbiddenCoordinate_1);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_2);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_3);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_4);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_5);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_6);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_7);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_8);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_9);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_10);
                }
            break;
            case (3): // right
                System.out.println("case 3");
                if ((column + 1) > 9) {
                    System.out.println("Try again");
                    placeOnField();
                } else {
                    increasingColumn(column, row);

                    String forbiddenCoordinate_1 = (shipsCoordinates[0] - 1) + "" + shipsCoordinates[1];
                    String forbiddenCoordinate_2 = (shipsCoordinates[0] - 1) + "" + (shipsCoordinates[1] - 1);
                    String forbiddenCoordinate_3 = (shipsCoordinates[0]) + "" + (shipsCoordinates[0] - 1);
                    String forbiddenCoordinate_4 = (shipsCoordinates[0] + 1) + "" + (shipsCoordinates[1] - 1);
                    String forbiddenCoordinate_5 = (shipsCoordinates[0] + 2) + "" + (shipsCoordinates[0] - 1);
                    String forbiddenCoordinate_6 = (shipsCoordinates[0] + 1) + "" + (shipsCoordinates[0]);
                    String forbiddenCoordinate_7 = (shipsCoordinates[0] + 2) + "" + (shipsCoordinates[0] + 1);
                    String forbiddenCoordinate_8 = (shipsCoordinates[0] + 1) + "" + (shipsCoordinates[0] + 1);
                    String forbiddenCoordinate_9 = (shipsCoordinates[0]) + "" + (shipsCoordinates[0] + 1);
                    String forbiddenCoordinate_10 = (shipsCoordinates[0] - 1) + "" + (shipsCoordinates[0] + 1);

                    ships.forbiddenCoordinates.add(forbiddenCoordinate_1);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_2);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_3);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_4);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_5);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_6);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_7);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_8);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_9);
                    ships.forbiddenCoordinates.add(forbiddenCoordinate_10);
                }
                break;
        }

        System.out.println("Coordinates of ship is " + ships.listOfCoordinates);
        System.out.println("Forbidden coordinates are " + ships.forbiddenCoordinates);

        return counter;
    }

    public int[]  decreasingColumn(int column, int row){
        shipsCoordinates[0] = column -1;
        shipsCoordinates[1] = row;
        for (int i = 0; i < destroyerSize; i++) {
            ships.listOfCoordinates.add((column - i) + "" + row);
            System.out.println("Coordinates are: " + ships.listOfCoordinates);
        }
        return shipsCoordinates;
    }

    public int[]  increasingRow(int column, int row) {
        shipsCoordinates[0] = column;
        shipsCoordinates[1] = row;
        for (int i = 0; i < destroyerSize; i++) {
            ships.listOfCoordinates.add(column + "" + (row + i));
            System.out.println("Coordinates are: " + ships.listOfCoordinates);
        }
        return shipsCoordinates;
    }

    public int[]  decreasingRow(int column, int row){
        shipsCoordinates[0] = column;
        shipsCoordinates[1] = row + 1;
            for (int i = 0; i < destroyerSize; i++) {
                ships.listOfCoordinates.add(column + "" + (row - i));
                System.out.println("Coordinates are: " + ships.listOfCoordinates);
            }
        return shipsCoordinates;
    }

    public int[] increasingColumn(int column, int row) {
        shipsCoordinates[0] = column;
        shipsCoordinates[1] = row;
        for (int i = 0; i < destroyerSize; i++) {
            ships.listOfCoordinates.add((column + i) + "" + row);
            System.out.println("Coordinates are: " + ships.listOfCoordinates);
        }
        return shipsCoordinates;
    }

}
