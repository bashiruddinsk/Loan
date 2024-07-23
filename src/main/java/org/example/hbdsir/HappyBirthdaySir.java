package org.example.hbdsir;

public class HappyBirthdaySir {
    public void happyBirthdaySir()throws Exception {

        int n = 5;

        for (int i = 0; i < n; i++) {    // h pattern
            System.out.print("                               ");
            for (int j = 0; j < n; j++) {

                if (j == 0 || j == n - 1 || i == n / 2) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.print("  ");
            Thread.sleep(300);
            //A
            for (int j = 0; j < n; j++) {

                if ((i == 0 && j == 0) || (i == 0 && j == n - 1)) {
                    System.out.print("  ");
                } else if (i == n / 2 || j == 0 || j == n - 1 || i == 0) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.print("  ");
            Thread.sleep(300);
            //P
            for (int j = 0; j < n; j++) {
                if ((i == n - 1 && j == n - 1) || (i == n - 2 && j == n - 1) || (i == n / 2 && j == n - 1) || (i == 0 && j == n - 1)) {
                    System.out.print("  ");
                } else {
                    if (i == 0 || j == 0 || i == n / 2 || i == 1 && j == n - 1) {
                        System.out.print("* ");
                    } else
                        System.out.print("  ");
                }

            }
            System.out.print("  ");
            Thread.sleep(300);
            //P
            for (int j = 0; j < n; j++) {
                if ((i == n - 1 && j == n - 1) || (i == n - 2 && j == n - 1) || (i == n / 2 && j == n - 1) || (i == 0 && j == n - 1)) {
                    System.out.print("  ");
                } else {
                    if (i == 0 || j == 0 || i == n / 2 || i == 1 && j == n - 1) {
                        System.out.print("* ");
                    } else
                        System.out.print("  ");
                }

            }
            System.out.print("  ");
            Thread.sleep(300);
            //Y
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == n / 2 || i == 1 && j == n / 2) {
                    System.out.print("  ");
                } else {
                    if (i == 0 && j == 0 || i == 1 && j == 1 || j == n / 2 || i == 0 && j == n - 1 || i == 1 && j == n - 2) {
                        System.out.print("* ");
                    } else
                        System.out.print("  ");
                }

            }
            System.out.println();
        }

        System.out.print("\n\n");

        for (int i = 0; i < n; i++) {
            System.out.print("             ");
            //B
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == n - 1 || i == n / 2 && j == n - 1 || i == n - 1 && j == n - 1) {
                    System.out.print("  ");
                } else {
                    if (i == 0 || j == 0 || j == n - 1 || i == n / 2 || i == n - 1) {
                        System.out.print("* ");
                    } else
                        System.out.print("  ");
                }
            }
            System.out.print("  ");
            Thread.sleep(300);
            //I
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == n / 2) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");

            }
            System.out.print("  ");
            Thread.sleep(300);
            //R
            for (int j = 0; j < n; j++) {

                if (i == 0 && j == n - 1 || i == 3 && j == 2 || i == 3 && j == 1 || i == 3 && j == n - 1) {
                    System.out.print("  ");
                } else {
                    if (i == 0 || j == 0 || i == n / 2 || j == n - 1 || i == 3) {
                        System.out.print("* ");
                    } else
                        System.out.print("  ");
                }
            }
            System.out.print("  ");
            Thread.sleep(300);
            //T
            for (int j = 0; j < n; j++) {

                if (i == 0 || j == n / 2) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");

            }
            System.out.print("  ");
            Thread.sleep(300);
            //H
            for (int j = 0; j < n; j++) {

                if (j == 0 || j == n - 1 || i == n / 2) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.print("  ");
            Thread.sleep(300);
            //D
            for (int j = 0; j < n; j++) {

                if (i == 0 && j == n - 1 || i == n - 1 && j == n - 1) {
                    System.out.print("  ");
                } else {
                    if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                        System.out.print("* ");
                    } else
                        System.out.print("  ");

                }
            }
            System.out.print("  ");
            Thread.sleep(300);
            //A
            for (int j = 0; j < n; j++) {

                if ((i == 0 && j == 0) || (i == 0 && j == n - 1)) {
                    System.out.print("  ");
                } else if (i == n / 2 || j == 0 || j == n - 1 || i == 0) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.print("  ");
            Thread.sleep(300);
            //Y
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == n / 2 || i == 1 && j == n / 2) {
                    System.out.print("  ");
                } else {
                    if (i == 0 && j == 0 || i == 1 && j == 1 || j == n / 2 || i == 0 && j == n - 1 || i == 1 && j == n - 2) {
                        System.out.print("* ");
                    } else
                        System.out.print("  ");
                }

            }
            System.out.println();
        }
        System.out.print("\n\n");

        for (int i = 0; i < n; i++) {
            System.out.print("                 ");
            System.out.print("  ");
            Thread.sleep(300);
            //K
            for (int j = 0; j < n - 1; j++) {

                if (j == 0 || (i == 1 && j == n - 3) || i == 0 && j == n - 2 || i == n / 2 && j == 1 || i == n - 2 && j == n - 3 || i == n - 1 && j == n - 2) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");

            }
            System.out.print("  ");
            Thread.sleep(300);
            //S
            for (int j = 0; j < n; j++) {
                if (i == 1 && j == n - 1 || i == n - 2 && j == 0 || i == 0 && j == 0 || i == n - 1 && j == n - 1) {
                    System.out.print("  ");
                } else {
                    if (i == 0 || j == 0 || i == n / 2 || j == n - 1 || i == n - 1) {
                        System.out.print("* ");
                    } else
                        System.out.print("  ");
                }
            }
            System.out.print("  ");
            Thread.sleep(300);
            //R
            for (int j = 0; j < n; j++) {

                if (i == 0 && j == n - 1 || i == 3 && j == 2 || i == 3 && j == 1 || i == 3 && j == n - 1) {
                    System.out.print("  ");
                } else {
                    if (i == 0 || j == 0 || i == n / 2 || j == n - 1 || i == 3) {
                        System.out.print("* ");
                    } else
                        System.out.print("  ");
                }
            }
            System.out.print("  |   ");
            Thread.sleep(300);
            //S
            for (int j = 0; j < n; j++) {
                if (i == 1 && j == n - 1 || i == n - 2 && j == 0 || i == 0 && j == 0 || i == n - 1 && j == n - 1) {
                    System.out.print("  ");
                } else {
                    if (i == 0 || j == 0 || i == n / 2 || j == n - 1 || i == n - 1) {
                        System.out.print("* ");
                    } else
                        System.out.print("  ");
                }
            }
            System.out.print("  ");
            Thread.sleep(300);
            //I
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == n / 2) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");

            }
            System.out.print("  ");
            Thread.sleep(300);
            //R
            for (int j = 0; j < n; j++) {

                if (i == 0 && j == n - 1 || i == 3 && j == 2 || i == 3 && j == 1 || i == 3 && j == n - 1) {
                    System.out.print("  ");
                } else {
                    if (i == 0 || j == 0 || i == n / 2 || j == n - 1 || i == 3) {
                        System.out.print("* ");
                    } else
                        System.out.print("  ");
                }
            }
            System.out.print("  ");
            Thread.sleep(300);
            //<3
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 1 || i == 0 && j == n - 2 || i == 1 && j == 0 || i == n / 2 && j == 0 || i == n - 2 && j == 1 || i == n - 1 && j == n / 2 || i == 1 && j == n / 2 || i == 1 && j == n - 1 || i == n / 2 && j == n - 1 || i == n - 2 && j == n - 2) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }


            System.out.println();
        }
    }
}
