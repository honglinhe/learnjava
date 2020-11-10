// package project;

// import java.util.Scanner;

// public class test {
// private static Scanner scanner = new Scanner(System.in);

// public static char readMenu() {
// char c;
// for (;;) {
// String str = readKeyBoard(1);
// c = str.charAt(0);
// if (c != '1' && c != '2' && c != '3' && c != '4') {
// System.out.print("cuowu");

// } else
// break;
// }
// return c;
// }

// public static int readNumber() {
// int n;
// for (;;) {
// String str = readKeyBoard(4);
// try {
// n = Integer.parseInt(str);
// } catch (NumberFormatException e) {
// System.out.print("cuowu");
// // TODO: handle exception
// }
// }
// return n;
// }

// public static String readString() {
// String str = readKeyBoard(8);
// return str;
// }

// public static char readConfirmSelection() {
// char c;
// for (;;) {
// String str = readKeyBoard(1).toUpperCase();
// c = str.charAt(0);
// if (c == 'Y' || c == 'N') {
// break;
// } else {
// System.out.println("cuowu");
// }
// }
// return c;
// }
// }
