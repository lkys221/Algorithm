public class Maze {
    final static int possiblePath = 0;
    final static int wall = 1;
    final static int visitedPath = 2;
    final static int correctPath = 3;

    public static void main(String[] args) {


       int[][] maze = {{0, 1, 1, 1},
                       {0, 0, 0, 0},
                       {1, 1, 0, 1},
                       {0, 0, 0, 0}};



        printMaze(maze);
        findPath(maze, 0, 0);
        System.out.println("");
        printMaze(maze);
    }




    public static boolean findPath(int[][] maze, int x, int y){
        if(x < 0 || y  < 0 || x >= maze.length || y >= maze.length){
            return false;
        }
        else if(x == maze.length-1 && y == maze.length-1) {
            maze[x][y] = correctPath;
            return true;
        }
        else if(maze[x][y] != possiblePath){
            return false;
        }
        else
            maze[x][y] = correctPath;
            if(findPath(maze, x-1, y) || findPath(maze, x, y+1) || findPath(maze, x+1, y) || findPath(maze, x, y-1))
                return true;
            maze[x][y] = visitedPath;
            return false;
    }




    public static void printMaze(int[][] maze) {
        if (maze.length != maze[0].length)
            System.out.println("Invalid maze format");

        else {
            for (int i = 0; i < maze.length; i++) {
                System.out.print("{ ");

                for (int j = 0; j < maze[i].length; j++) {
                    System.out.print(maze[i][j] + " ");
                    }
                System.out.print("}");
                System.out.println("");
            }
        }
    }

}



