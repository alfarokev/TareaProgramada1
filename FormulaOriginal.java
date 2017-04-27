package FormulaMethods;

import Estructuras.LinkedQueue;
import Objects.LinkedExc;
import java.util.ArrayList;

/**
 *
 * @author "Kevin Alfaro - B40166";
 */
public class FormulaOriginal {

    LinkedQueue originalQueue = new LinkedQueue();
    ArrayList<Character> operadores = new ArrayList();
    String numeros = "[0-9]";
    String puntos = "[.,]";

    public FormulaOriginal() {
        addOp();
    }

    public final void addOp() {
        operadores.add('+');
        operadores.add('-');
        operadores.add('*');
        operadores.add('/');
        operadores.add('(');
        operadores.add(')');
        operadores.add('{');
        operadores.add('}');
        operadores.add('[');
        operadores.add(']');
    }

    public LinkedQueue convertFormula(String formula) throws LinkedExc {
        char charFormula[] = formula.toLowerCase().toCharArray();
        for (int i = 0; i < charFormula.length; i++) {
            char c = charFormula[i];
            if (c == 's') {
                if (sen(charFormula, i) == true) {
                    i = i + 2;
                    continue;
                }
                if (sqrt(charFormula, i) == true) {
                    i = i + 3;
                    continue;
                }
            }
            if (c == 't') {
                if (tan(charFormula, i) == true) {
                    i = i + 2;
                    continue;
                }

            }
            if (c == 'c') {
                if (cos(charFormula, i) == true) {
                    i = i + 2;
                    continue;
                }

            }
            if (c == 'f') {
                if (facto(charFormula, i) == true) {
                    i = i + 4;
                    continue;
                }

            }
            if (operadores.contains(c)) {
                originalQueue.enqueue("" + c);
                continue;
            }
            while (i <= charFormula.length - 1) {
                ArrayList<Character> lst = new ArrayList<>();
                String s = "" + charFormula[i];
                if (s.matches(numeros) || s.matches(puntos)) {
                    lst.add(charFormula[i]);
                    if (i == charFormula.length - 1) {
                        originalQueue.enqueue(convertListtoString(lst));
                        break;
                    }
                    i = i + 1;
                } else {
                    originalQueue.enqueue(convertListtoString(lst));
                    i = i - 1;
                    break;
                }

            }
        }
        return originalQueue;
    }

    public String convertListtoString(ArrayList<Character> list) throws LinkedExc {
        String result = "";
        for (char c : list) {
            result = result + c;
        }
        return result;
    }

    public boolean sen(char[] charFormula, int i) throws LinkedExc {
        if (charFormula[i + 1] == 'e') {
            if (charFormula[i + 2] == 'n') {
                originalQueue.enqueue("$");
                return true;
            }
        }
        return false;
    }

    public boolean cos(char[] charFormula, int i) throws LinkedExc {
        if (charFormula[i + 1] == 'o') {
            if (charFormula[i + 2] == 's') {
                originalQueue.enqueue("#");
                return true;
            }
        }
        return false;
    }

    public boolean tan(char[] charFormula, int i) throws LinkedExc {
        if (charFormula[i + 1] == 'a') {
            if (charFormula[i + 2] == 'n') {
                originalQueue.enqueue("@");
                return true;
            }
        }
        return false;
    }

    public boolean sqrt(char[] charFormula, int i) throws LinkedExc {
        if (charFormula[i + 1] == 'q') {
            if (charFormula[i + 2] == 'r') {
                if (charFormula[i + 3] == 't') {
                    originalQueue.enqueue("!");
                    return true;
                }
            }
        }
        return false;
    }

    public boolean facto(char[] charFormula, int i) throws LinkedExc {
        if (charFormula[i + 1] == 'a') {
            if (charFormula[i + 2] == 'c') {
                if (charFormula[i + 3] == 't') {
                    if (charFormula[i + 4] == 'o') {
                        originalQueue.enqueue("%");
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
