// every java file must have a class with the same name as the file
public class Tabulator {
    // define the main function that will be called when this class is executed
    // with java Tabulator < data.txt
    public static void main(String[] args) {
        // just print a simple header to the screen
        StdOut.printf("%-20s | %-20s| %-20s| %-20s\n", "Name", "Val 1", "Val 2", "Results");
        for (int i = 0; i < 86; i++) StdOut.print('-');
        StdOut.print('\n');

        // at this point you will want to start reading from stdin. Java has
        // built in libraries for this but the text book's companion site
        // provides helper APIs that should make this a bit simpler. These APIs
        // should be available as long as you followed the instructions from the
        // course into email and slides
        //
        // I would recommend using the StdIn.isEmpty. Check out the links in the
        // readme as well as the direct documentation for the function at
        // https://algs4.cs.princeton.edu/code/javadoc/edu/princeton/cs/algs4/StdIn.html#isEmpty--
        //
        // That function combined with a loop will let you read from stdin untill
        // there is no more data to read. You will also want to store the data
        // into variables. In this case you will want to use a String for the
        // name and double for the values.
        //
        // For this you will want to use the StdIn.readString and StdIn.readDouble
        // functions which will read the appropriate data from stdin
        //
        // https://algs4.cs.princeton.edu/code/javadoc/edu/princeton/cs/algs4/StdIn.html#readString--
        // https://algs4.cs.princeton.edu/code/javadoc/edu/princeton/cs/algs4/StdIn.html#readDouble--

    }
}
