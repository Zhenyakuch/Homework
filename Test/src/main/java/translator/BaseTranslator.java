package translator;

import directory.Dictionary;

import java.util.Scanner;

public class BaseTranslator {
    private static int count = 0;
    private static long last = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long number = scanner.nextLong();

        String str = number.toString();
        StringBuffer stringBuffer = new StringBuffer(str);

        String str2 = String.valueOf(stringBuffer.reverse());
        Long reverse_number = Long.parseLong(str2);

        count = str2.length() + 1;

        for (int i = 0; i < str.length(); i++) {
            last = reverse_number % 10;
            reverse_number = reverse_number / 10;
            count--;

//продумать 10 и нули 11 b 12 13 14
            if (str.length() < 5) {
               number_1();
               number_2();
               number_3();
               number_4();
            } else if (str.length() == 5) {
                number_1();
                number_2();
                number_3();
                number_4();
               number_5();
            }
            else if (str.length() == 6) {
                number_1();
                number_2();
                number_3();
                number_4();
                number_5();
                number_6();
            }
            else if (str.length() == 7) {
                number_1();
                number_2();
                number_3();
                number_4();
                number_5();
                number_6();
                number_7();
            }
            else if (str.length() == 8) {
                number_1();
                number_2();
                number_3();
                number_4();
                number_5();
                number_6();
                number_7();
                number_8();
            }
            else if (str.length() == 9) {
                number_1();
                number_2();
                number_3();
                number_4();
                number_5();
                number_6();
                number_7();
                number_8();
                number_9();
            }
            else if (str.length() == 10) {
                number_1();
                number_2();
                number_3();
                number_4();
                number_5();
                number_6();
                number_7();
                number_8();
                number_9();
                number_10();
            }
            else if (str.length() == 11) {
                number_1();
                number_2();
                number_3();
                number_4();
                number_5();
                number_6();
                number_7();
                number_8();
                number_9();
                number_10();
                number_11();
            }
            else if (str.length() == 12) {
                number_1();
                number_2();
                number_3();
                number_4();
                number_5();
                number_6();
                number_7();
                number_8();
                number_9();
                number_10();
                number_11();
                number_12();
            }

            scanner.close();
        }

    }

    private static void number_1() {
        switch (count) {
            case 1:
                if (last == 0) {
                    number_2();
                } else if (last == 1) {
                    System.out.printf(Dictionary.one);
                } else if (last == 2) {
                    System.out.printf(Dictionary.two);
                } else if (last == 3) {
                    System.out.printf(Dictionary.three);
                } else if (last == 4) {
                    System.out.printf(Dictionary.four);
                } else if (last == 5) {
                    System.out.printf(Dictionary.five);
                } else if (last == 6) {
                    System.out.printf(Dictionary.six);
                } else if (last == 7) {
                    System.out.printf(Dictionary.seven);
                } else if (last == 8) {
                    System.out.printf(Dictionary.eight);
                } else if (last == 9) {
                    System.out.printf(Dictionary.nine);
                }
                break;
        }
    }

    private static void number_2() {
        switch (count) {
            case 2:
                if (last == 1) {
                    System.out.printf(Dictionary.ten[0]);
                } else if (last == 2) {
                    System.out.printf(Dictionary.ten[1]);
                } else if (last == 3) {
                    System.out.printf(Dictionary.ten[2]);
                } else if (last == 4) {
                    System.out.printf(Dictionary.ten[3]);
                } else if (last == 5) {
                    System.out.printf(Dictionary.ten[4]);
                } else if (last == 6) {
                    System.out.printf(Dictionary.ten[5]);
                } else if (last == 7) {
                    System.out.printf(Dictionary.ten[6]);
                } else if (last == 8) {
                    System.out.printf(Dictionary.ten[7]);
                } else if (last == 9) {
                    System.out.printf(Dictionary.ten[8]);
                }
                break;
        }
    }
    private static void number_3() {
        switch (count) {
            case 3:
                if (last == 1) {
                    System.out.printf(Dictionary.hundred[0]);
                } else if (last == 2) {
                    System.out.printf(Dictionary.hundred[1]);
                } else if (last == 3) {
                    System.out.printf(Dictionary.hundred[2]);
                } else if (last == 4) {
                    System.out.printf(Dictionary.hundred[3]);
                } else if (last == 5) {
                    System.out.printf(Dictionary.hundred[4]);
                } else if (last == 6) {
                    System.out.printf(Dictionary.hundred[5]);
                } else if (last == 7) {
                    System.out.printf(Dictionary.hundred[6]);
                } else if (last == 8) {
                    System.out.printf(Dictionary.hundred[7]);
                } else if (last == 9) {
                    System.out.printf(Dictionary.hundred[8]);
                }
                break;
        }
    }
    public  static void number_4() {
        switch (count) {
            case 4:
                if (last == 1) {
                    System.out.printf(Dictionary.thousand[0]);
                } else if (last == 2) {
                    System.out.printf(Dictionary.thousand[1]);
                } else if (last == 3) {
                    System.out.printf(Dictionary.thousand[2]);
                } else if (last == 4) {
                    System.out.printf(Dictionary.thousand[3]);
                } else if (last == 5) {
                    System.out.printf(Dictionary.thousand[4]);
                } else if (last == 6) {
                    System.out.printf(Dictionary.thousand[5]);
                } else if (last == 7) {
                    System.out.printf(Dictionary.thousand[6]);
                } else if (last == 8) {
                    System.out.printf(Dictionary.thousand[7]);
                } else if (last == 9) {
                    System.out.printf(Dictionary.thousand[8]);
                }
                break;
        }
    }
    private static void number_6() {
        switch (count){
            case 6:
                if (last == 1) {
                    System.out.printf( Dictionary.hundred[0]);
                } else if (last == 2) {
                    System.out.printf(Dictionary.hundred[1]);
                } else if (last == 3) {
                    System.out.printf( Dictionary.hundred[2]);
                } else if (last == 4) {
                    System.out.printf( Dictionary.hundred[3]);
                } else if (last == 5) {
                    System.out.printf( Dictionary.hundred[4]);
                } else if (last == 6) {
                    System.out.printf( Dictionary.hundred[5]);
                } else if (last == 7) {
                    System.out.printf(Dictionary.hundred[6]);
                } else if (last == 8) {
                    System.out.printf( Dictionary.hundred[7]);
                } else if (last == 9) {
                    System.out.printf(Dictionary.hundred[8]);
                }
        }
    }
    private static void number_5() {
        switch (count) {
            case 5:
                if (last == 1) {
                    System.out.printf(Dictionary.ten[0]);
                } else if (last == 2) {
                    System.out.printf(Dictionary.ten[1]);
                } else if (last == 3) {
                    System.out.printf(Dictionary.ten[2]);
                } else if (last == 4) {
                    System.out.printf(Dictionary.ten[3]);
                } else if (last == 5) {
                    System.out.printf(Dictionary.ten[4]);
                } else if (last == 6) {
                    System.out.printf(Dictionary.ten[5]);
                } else if (last == 7) {
                    System.out.printf(Dictionary.ten[6]);
                } else if (last == 8) {
                    System.out.printf(Dictionary.ten[7]);
                } else if (last == 9) {
                    System.out.printf(Dictionary.ten[8]);
                }
                break;
        }
    }
    private static void number_7() {
        switch (count){
            case 7:
                if (last == 1) {
                    System.out.printf(Dictionary.one + Dictionary.million[0]);
                } else if (last == 2) {
                    System.out.printf(Dictionary.two+ Dictionary.million[1]);
                } else if (last == 3) {
                    System.out.printf(Dictionary.three+ Dictionary.million[2]);
                } else if (last == 4) {
                    System.out.printf(Dictionary.four+ Dictionary.million[3]);
                } else if (last == 5) {
                    System.out.printf(Dictionary.five+ Dictionary.million[4]);
                } else if (last == 6) {
                    System.out.printf(Dictionary.six+ Dictionary.million[5]);
                } else if (last == 7) {
                    System.out.printf(Dictionary.seven+ Dictionary.million[6]);
                } else if (last == 8) {
                    System.out.printf(Dictionary.eight+ Dictionary.million[7]);
                } else if (last == 9) {
                    System.out.printf(Dictionary.nine+ Dictionary.million[8]);
                }
        }
    }
    private static void number_8() {
        switch (count) {
            case 8:
                if (last == 1) {
                    System.out.printf(Dictionary.ten[0]);
                } else if (last == 2) {
                    System.out.printf(Dictionary.ten[1]);
                } else if (last == 3) {
                    System.out.printf(Dictionary.ten[2]);
                } else if (last == 4) {
                    System.out.printf(Dictionary.ten[3]);
                } else if (last == 5) {
                    System.out.printf(Dictionary.ten[4]);
                } else if (last == 6) {
                    System.out.printf(Dictionary.ten[5]);
                } else if (last == 7) {
                    System.out.printf(Dictionary.ten[6]);
                } else if (last == 8) {
                    System.out.printf(Dictionary.ten[7]);
                } else if (last == 9) {
                    System.out.printf(Dictionary.ten[8] );
                }
        }
    }
    private static void number_9() {
        switch (count) {
            case 9:
                if (last == 1) {
                    System.out.printf(Dictionary.hundred[0]);
                } else if (last == 2) {
                    System.out.printf(Dictionary.hundred[1]);
                } else if (last == 3) {
                    System.out.printf(Dictionary.hundred[2]);
                } else if (last == 4) {
                    System.out.printf(Dictionary.hundred[3]);
                } else if (last == 5) {
                    System.out.printf(Dictionary.hundred[4]);
                } else if (last == 6) {
                    System.out.printf(Dictionary.hundred[5]);
                } else if (last == 7) {
                    System.out.printf(Dictionary.hundred[6]);
                } else if (last == 8) {
                    System.out.printf(Dictionary.hundred[7]);
                } else if (last == 9) {
                    System.out.printf(Dictionary.hundred[8] );
                }
        }
    }
    private static void number_10() {
        switch (count) {
            case 10:
                if (last == 0) {
                    number_2();
                } else if (last == 1) {
                    System.out.printf(Dictionary.one + Dictionary.billion[0]);
                } else if (last == 2) {
                    System.out.printf(Dictionary.two + Dictionary.billion[1]);
                } else if (last == 3) {
                    System.out.printf(Dictionary.three + Dictionary.billion[2]);
                } else if (last == 4) {
                    System.out.printf(Dictionary.four + Dictionary.billion[3]);
                } else if (last == 5) {
                    System.out.printf(Dictionary.five + Dictionary.billion[4]);
                } else if (last == 6) {
                    System.out.printf(Dictionary.six + Dictionary.billion[5]);
                } else if (last == 7) {
                    System.out.printf(Dictionary.seven + Dictionary.billion[6]);
                } else if (last == 8) {
                    System.out.printf(Dictionary.eight + Dictionary.billion[7]);
                } else if (last == 9) {
                    System.out.printf(Dictionary.nine + Dictionary.billion[8]);
                }
                break;
        }
    }
    private static void number_11() {
        switch (count) {
            case 11:
                if (last == 0) {
                    number_2();
                } else if (last == 1) {
                    System.out.printf(Dictionary.ten[0]);
                } else if (last == 2) {
                    System.out.printf(Dictionary.ten[1]);
                } else if (last == 3) {
                    System.out.printf(Dictionary.ten[2]);
                } else if (last == 4) {
                    System.out.printf(Dictionary.ten[3]);
                } else if (last == 5) {
                    System.out.printf(Dictionary.ten[4]);
                } else if (last == 6) {
                    System.out.printf(Dictionary.ten[5]);
                } else if (last == 7) {
                    System.out.printf(Dictionary.ten[6]);
                } else if (last == 8) {
                    System.out.printf(Dictionary.ten[7]);
                } else if (last == 9) {
                    System.out.printf(Dictionary.ten[8]);
                }
                break;
        }
    }
    private static void number_12() {
        switch (count) {
            case 12:
                if (last == 0) {
                    number_2();
                } else if (last == 1) {
                    System.out.printf(Dictionary.hundred[0]);
                } else if (last == 2) {
                    System.out.printf(Dictionary.hundred[1]);
                } else if (last == 3) {
                    System.out.printf(Dictionary.hundred[2]);
                } else if (last == 4) {
                    System.out.printf(Dictionary.hundred[3]);
                } else if (last == 5) {
                    System.out.printf(Dictionary.hundred[4]);
                } else if (last == 6) {
                    System.out.printf(Dictionary.hundred[5]);
                } else if (last == 7) {
                    System.out.printf(Dictionary.hundred[6]);
                } else if (last == 8) {
                    System.out.printf(Dictionary.hundred[7]);
                } else if (last == 9) {
                    System.out.printf(Dictionary.hundred[8]);
                }
                break;
        }
    }
}

