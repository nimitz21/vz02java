package animal;
import java.util.TreeSet;
import java.util.Set;
import pair.Pair;
/**
 * Created by ASUS INDONESIA on 3/27/2017.
 */
/**
 * Created by asuspc on 3/27/2017.
 */
public class Animal{
    public Animal(String _id,
                  Pair _position
                  ) {
        id = _id;
        /*
        number = _number;
        legend = _legend;
        eat = _eat;
        type = _type;
        */
        position.first = _position.first;
        position.second = _position.second;
        if(_id == "WF") {
            wolf_nb++;
            food = 0.2;
            weight = 45;
            compatible.add("WF");
            compatible.add("ELP");
            compatible.add("HPP");
            habitat.add('L');
        } else if (_id == "LI") {
            lion_nb++;
            food = 0.5;
            weight = 158;
            compatible.add("LI");
            habitat.add('L');
        } else if (_id == "ZBR") {
            zebra_nb++;
            food = 0.3;
            weight = 226;
            compatible.add("ZBR");
            compatible.add("ELP");
            compatible.add("MCQ");
            compatible.add("HG");
            compatible.add("PNG");
            compatible.add("HPP");
            compatible.add("DRL");
            compatible.add("CLG");
            compatible.add("SGL");
            habitat.add('L');
        } else if (_id == "ELP") {
            elephant_nb++;
            food = 0.7;
            weight = 5000;
            habitat.add('L');
            compatible.add("WF");
            compatible.add("ZBR");
            compatible.add("ELP");
            compatible.add("MCQ");
            compatible.add("HG");
            compatible.add("PNG");
            compatible.add("HPP");
        } else if (_id == "MCQ") {
            macaque_nb++;
            food=0.2;
            weight = 9;
            habitat.add('L');
            compatible.add("ZBR");
            compatible.add("ELP");
            compatible.add("MCQ");
            compatible.add("HG");
            compatible.add("HPP");
            compatible.add("DRL");
            compatible.add("CLG");
            compatible.add("SGL");
        } else if (_id == "HG") {
            hog_nb++;
            food = 0.2;
            weight = 68;
            habitat.add('L');
            compatible.add("ZBR");
            compatible.add("ELP");
            compatible.add("MCQ");
            compatible.add("HG");
            compatible.add("HPP");
        } else if (_id == "SHK") {
            shark_nb++;
            food = 0.2;
            weight = 771;
            habitat.add('W');
            compatible.add("SHK");
            compatible.add("WHL");
        } else if (_id == "MRE") {
            moray_eel_nb++;
            food = 0.2;
            weight = 13;
            habitat.add('W');
            compatible.add("MRE");
            compatible.add("DGG");
            compatible.add("TRL");
            compatible.add("DLP");
            compatible.add("WHL");
            compatible.add("HPP");
        } else if (_id == "DGG") {
            dugong_nb++;
            food = 0.2;
            weight = 294;
            habitat.add('W');
            compatible.add("MRE");
            compatible.add("DGG");
            compatible.add("TRL");
            compatible.add("DLP");
            compatible.add("WHL");
            compatible.add("PNG");
            compatible.add("HPP");
            compatible.add("PLC");
            compatible.add("GSE");
            compatible.add("CRN");
        } else if (_id == "TRL") {
            turtle_nb++;
            food = 0.05;
            weight = 453;
            habitat.add('W');
            compatible.add("MRE");
            compatible.add("DGG");
            compatible.add("TRL");
            compatible.add("DLP");
            compatible.add("WHL");
            compatible.add("PNG");
            compatible.add("HPP");
            compatible.add("GSE");
            compatible.add("CRN");
        } else if (_id == "DLP") {
            dolphin_nb++;
            food = 0.2;
            weight = 220;
            habitat.add('W');
            compatible.add("MRE");
            compatible.add("DGG");
            compatible.add("TRL");
            compatible.add("DLP");
            compatible.add("WHL");
            compatible.add("PNG");
            compatible.add("HPP");
            compatible.add("PLC");
            compatible.add("GSE");
            compatible.add("CRN");
        } else if (_id == "WHL") {
            whale_nb++;
            food = 0.1;
            weight = 40000;
            habitat.add('W');
            compatible.add("SHK");
            compatible.add("MRE");
            compatible.add("DGG");
            compatible.add("TRL");
            compatible.add("DLP");
            compatible.add("WHL");
            compatible.add("PNG");
            compatible.add("HPP");
            compatible.add("PLC");
            compatible.add("GSE");
            compatible.add("CRN");
        } else if (_id == "EGL") {
            eagle_nb++;
            food = 0.7;
            weight = 4;
            habitat.add('A');
            compatible.add("EGL");
            compatible.add("OW");
            compatible.add("PLC");
        } else if (_id == "OW") {
            owl_nb++;
            food = 0.3;
            weight = 2;
            habitat.add('A');
            compatible.add("EGL");
            compatible.add("OW");
            compatible.add("PLC");
            compatible.add("DRL");
        } else if (_id == "HMB") {
            hummingbird_nb++;
            food = 0.3;
            weight = 0.0002;
            habitat.add('A');
            compatible.add("HMB");
            compatible.add("CKT");
            compatible.add("RBN");
            compatible.add("BT");
            compatible.add("PLC");
            compatible.add("GSE");
            compatible.add("CRN");
            compatible.add("CLG");
            compatible.add("SGL");
        } else if (_id == "CKT") {
            cockatoo_nb++;
            food = 0.3;
            weight = 0.09;
            habitat.add('A');
            compatible.add("HMB");
            compatible.add("CKT");
            compatible.add("RBN");
            compatible.add("BT");
            compatible.add("PLC");
            compatible.add("GSE");
            compatible.add("CRN");
            compatible.add("CLG");
        } else if (_id == "RBN") {
            robin_nb++;
            food = 0.3;
            weight = 0.06;
            habitat.add('A');
            compatible.add("HMB");
            compatible.add("CKT");
            compatible.add("RBN");
            compatible.add("BT");
            compatible.add("PLC");
            compatible.add("GSE");
            compatible.add("CRN");
            compatible.add("CLG");
            compatible.add("DRL");
        } else if (_id == "BT") {
            bat_nb++;
            food = 0.4;
            weight = 0.15;
            habitat.add('A');
            compatible.add("HMB");
            compatible.add("CKT");
            compatible.add("RBN");
            compatible.add("BT");
            compatible.add("PLC");
            compatible.add("GSE");
            compatible.add("CRN");
        } else if (_id == "PNG") {
            penguin_nb++;
            food = 0.25;
            weight = 22;
            habitat.add('L');
            habitat.add('W');
            compatible.add("ZBR");
            compatible.add("ELP");
            compatible.add("PNG");
            compatible.add("HPP");
            compatible.add("DRL");
            compatible.add("CLG");
            compatible.add("SGL");
            compatible.add("DGG");
            compatible.add("TRL");
            compatible.add("DLP");
            compatible.add("WHL");
            compatible.add("PLC");
            compatible.add("GSE");
            compatible.add("CRN");
        } else if (_id == "HPP") {
            hippopotamus_nb++;
            food = 0.65;
            weight = 1496;
            habitat.add('L');
            habitat.add('W');
            compatible.add("WF");
            compatible.add("ZBR");
            compatible.add("ELP");
            compatible.add("MCQ");
            compatible.add("HG");
            compatible.add("PNG");
            compatible.add("HPP");
            compatible.add("CLG");
            compatible.add("MRE");
            compatible.add("DGG");
            compatible.add("TRL");
            compatible.add("DLP");
            compatible.add("WHL");
            compatible.add("PLC");
            compatible.add("GSE");
            compatible.add("CRN");
        } else if (_id == "PLC") {
            pelican_nb++;
            food = 0.3;
            weight = 7;
            habitat.add('W');
            habitat.add('A');
            compatible.add("MRE");
            compatible.add("DGG");
            compatible.add("DLP");
            compatible.add("WHL");
            compatible.add("PNG");
            compatible.add("HPP");
            compatible.add("PLC");
            compatible.add("GSE");
            compatible.add("CRN");
            compatible.add("EGL");
            compatible.add("OW");
            compatible.add("HMB");
            compatible.add("CKT");
            compatible.add("RBN");
            compatible.add("BT");
            compatible.add("CLG");
            compatible.add("SGL");
        } else if (_id == "GSE") {
            goose_nb++;
            food = 0.3;
            weight = 4;
            habitat.add('W');
            habitat.add('A');
            compatible.add("MRE");
            compatible.add("DGG");
            compatible.add("TRL");
            compatible.add("DLP");
            compatible.add("WHL");
            compatible.add("PNG");
            compatible.add("HPP");
            compatible.add("PLC");
            compatible.add("GSE");
            compatible.add("CRN");
            compatible.add("HMB");
            compatible.add("CKT");
            compatible.add("RBN");
            compatible.add("BT");
            compatible.add("CLG");
            compatible.add("SGL");
        } else if (_id == "CRN") {
            crane_nb++;
            food = 0.3;
            weight = 3;
            habitat.add('W');
            habitat.add('A');
            compatible.add("MRE");
            compatible.add("DGG");
            compatible.add("TRL");
            compatible.add("DLP");
            compatible.add("WHL");
            compatible.add("PNG");
            compatible.add("HPP");
            compatible.add("PLC");
            compatible.add("GSE");
            compatible.add("CRN");
            compatible.add("HMB");
            compatible.add("CKT");
            compatible.add("RBN");
            compatible.add("BT");
            compatible.add("DRL");
            compatible.add("CLG");
            compatible.add("SGL");
        } else if (_id == "DRL") {
            draco_lizard_nb++;
            food = 0.2;
            weight = 0.2;
            habitat.add('L');
            habitat.add('A');
            compatible.add("ZBR");
            compatible.add("MCQ");
            compatible.add("HG");
            compatible.add("PNG");
            compatible.add("DRL");
            compatible.add("CLG");
            compatible.add("SGL");
            compatible.add("OW");
            compatible.add("RBN");
            compatible.add("GSE");
            compatible.add("CRN");
        } else if (_id == "CLG") {
            colugo_nb++;
            food = 0.25;
            weight = 0.035;
            habitat.add('L');
            habitat.add('A');
            compatible.add("ZBR");
            compatible.add("MCQ");
            compatible.add("HG");
            compatible.add("PNG");
            compatible.add("HPP");
            compatible.add("DRL");
            compatible.add("CLG");
            compatible.add("SGL");
            compatible.add("HMB");
            compatible.add("CKT");
            compatible.add("RBN");
            compatible.add("GSE");
            compatible.add("CRN");
        } else if (_id == "SGL") {
            sugar_glider_nb++;
            food = 0.5;
            weight = 0.12;
            habitat.add('L');
            habitat.add('A');
            compatible.add("ZBR");
            compatible.add("MCQ");
            compatible.add("HG");
            compatible.add("PNG");
            compatible.add("DRL");
            compatible.add("CLG");
            compatible.add("SGL");
            compatible.add("HMB");
            compatible.add("GSE");
            compatible.add("CRN");
        }
        else{
        	food = 0.1;
				}
    }
    public Animal(String _id,
                  double _weight,
                  Pair _position) {
        id = _id;
        /*
        number = _number;
        legend = _legend;
        eat = _eat;
        type = _type;
        */
				weight = _weight;
        position.first = _position.first;
        position.second = _position.second;
        if(_id == "WF") {
        		number = ++wolf_nb; // ini jadi gini
        		legend = '1'; // ini juga
        		eat = 0.2; // ini diambil dari wolf.cpp yang dlu diliat isinya berapa
						type = 'K'; // ini juga diliat
            food = 0.2;
            compatible.add("WF");
            compatible.add("ELP");
            compatible.add("HPP");
            habitat.add('L');
        } else if (_id == "LI") {
            number = ++lion_nb;
            legend = '2';
            eat = 0.5;
            type = 'K';
            food = 0.5;
            compatible.add("LI");
            habitat.add('L');
        } else if (_id == "ZBR") {
            number = ++zebra_nb;
            legend = '3';
            eat = 0.3;
            type = 'H';
            food = 0.3;
            compatible.add("ZBR");
            compatible.add("ELP");
            compatible.add("MCQ");
            compatible.add("HG");
            compatible.add("PNG");
            compatible.add("HPP");
            compatible.add("DRL");
            compatible.add("CLG");
            compatible.add("SGL");
            habitat.add('L');
        } else if (_id == "ELP") {
            number = ++elephant_nb;
            legend = '4';
            eat = 0.7;
            type = 'H';
            food = 0.7;
            habitat.add('L');
            compatible.add("WF");
            compatible.add("ZBR");
            compatible.add("ELP");
            compatible.add("MCQ");
            compatible.add("HG");
            compatible.add("PNG");
            compatible.add("HPP");
        } else if (_id == "MCQ") {
            number = ++macaque_nb;
            legend = '5';
            eat = 0.2;
            type = 'O';
            food=0.2;
            habitat.add('L');
            compatible.add("ZBR");
            compatible.add("ELP");
            compatible.add("MCQ");
            compatible.add("HG");
            compatible.add("HPP");
            compatible.add("DRL");
            compatible.add("CLG");
            compatible.add("SGL");
        } else if (_id == "HG") {
            number = ++hog_nb;
            legend = '6';
            eat = 0.2;
            type = 'O';
            food = 0.2;
            habitat.add('L');
            compatible.add("ZBR");
            compatible.add("ELP");
            compatible.add("MCQ");
            compatible.add("HG");
            compatible.add("HPP");
        } else if (_id == "SHK") {
            number = ++shark_nb;
            legend = '7';
            eat = 0.2;
            type = 'K';
            food = 0.2;
            habitat.add('W');
            compatible.add("SHK");
            compatible.add("WHL");
        } else if (_id == "MRE") {
            number = ++moray_eel_nb;
            legend = '8';
            eat = 0.2;
            type = 'K';
            food = 0.2;
            habitat.add('W');
            compatible.add("MRE");
            compatible.add("DGG");
            compatible.add("TRL");
            compatible.add("DLP");
            compatible.add("WHL");
            compatible.add("HPP");
        } else if (_id == "DGG") {
            number = ++dugong_nb;
            legend = '9';
            eat = 0.2;
            type = 'H';
            food = 0.2;
            habitat.add('W');
            compatible.add("MRE");
            compatible.add("DGG");
            compatible.add("TRL");
            compatible.add("DLP");
            compatible.add("WHL");
            compatible.add("PNG");
            compatible.add("HPP");
            compatible.add("PLC");
            compatible.add("GSE");
            compatible.add("CRN");
        } else if (_id == "TRL") {
            number = ++turtle_nb;
            legend = '0';
            eat = 0.05;
            type = 'H';
            food = 0.05;
            habitat.add('W');
            compatible.add("MRE");
            compatible.add("DGG");
            compatible.add("TRL");
            compatible.add("DLP");
            compatible.add("WHL");
            compatible.add("PNG");
            compatible.add("HPP");
            compatible.add("GSE");
            compatible.add("CRN");
        } else if (_id == "DLP") {
            number = ++dolphin_nb;
            legend = '!';
            eat = 0.2;
            type = 'K';
            food = 0.2;
            habitat.add('W');
            compatible.add("MRE");
            compatible.add("DGG");
            compatible.add("TRL");
            compatible.add("DLP");
            compatible.add("WHL");
            compatible.add("PNG");
            compatible.add("HPP");
            compatible.add("PLC");
            compatible.add("GSE");
            compatible.add("CRN");
        } else if (_id == "WHL") {
            number = ++whale_nb;
            legend = '@';
            eat = 0.1;
            type = 'O';
            food = 0.1;
            habitat.add('W');
            compatible.add("SHK");
            compatible.add("MRE");
            compatible.add("DGG");
            compatible.add("TRL");
            compatible.add("DLP");
            compatible.add("WHL");
            compatible.add("PNG");
            compatible.add("HPP");
            compatible.add("PLC");
            compatible.add("GSE");
            compatible.add("CRN");
        } else if (_id == "EGL") {
            number = ++eagle_nb;
            legend = '#';
            eat = 0.7;
            type = 'K';
            food = 0.7;
            habitat.add('A');
            compatible.add("EGL");
            compatible.add("OW");
            compatible.add("PLC");
        } else if (_id == "OW") {
            number = ++owl_nb;
            legend = '$';
            eat = 0.3;
            type = 'K';
            food = 0.3;
            habitat.add('A');
            compatible.add("EGL");
            compatible.add("OW");
            compatible.add("PLC");
            compatible.add("DRL");
        } else if (_id == "HMB") {
            number = ++hummingbird_nb;
            legend = '%';
            eat = 0.3;
            type = 'H';
            food = 0.3;
            habitat.add('A');
            compatible.add("HMB");
            compatible.add("CKT");
            compatible.add("RBN");
            compatible.add("BT");
            compatible.add("PLC");
            compatible.add("GSE");
            compatible.add("CRN");
            compatible.add("CLG");
            compatible.add("SGL");
        } else if (_id == "CKT") {
            number = ++cockatoo_nb;
            legend = '^';
            eat = 0.3;
            type = 'H';
            food = 0.3;
            habitat.add('A');
            compatible.add("HMB");
            compatible.add("CKT");
            compatible.add("RBN");
            compatible.add("BT");
            compatible.add("PLC");
            compatible.add("GSE");
            compatible.add("CRN");
            compatible.add("CLG");
        } else if (_id == "RBN") {
            number = ++robin_nb;
            legend = '&';
            eat = 0.3;
            type = 'O';
            food = 0.3;
            habitat.add('A');
            compatible.add("HMB");
            compatible.add("CKT");
            compatible.add("RBN");
            compatible.add("BT");
            compatible.add("PLC");
            compatible.add("GSE");
            compatible.add("CRN");
            compatible.add("CLG");
            compatible.add("DRL");
        } else if (_id == "BT") {
            number = ++bat_nb;
            legend = '*';
            eat = 0.4;
            type = 'O';
            food = 0.4;
            habitat.add('A');
            compatible.add("HMB");
            compatible.add("CKT");
            compatible.add("RBN");
            compatible.add("BT");
            compatible.add("PLC");
            compatible.add("GSE");
            compatible.add("CRN");
        } else if (_id == "PNG") {
            number = ++penguin_nb;
            legend = '(';
            eat = 0.25;
            type = 'K';
            food = 0.25;
            habitat.add('L');
            habitat.add('W');
            compatible.add("ZBR");
            compatible.add("ELP");
            compatible.add("PNG");
            compatible.add("HPP");
            compatible.add("DRL");
            compatible.add("CLG");
            compatible.add("SGL");
            compatible.add("DGG");
            compatible.add("TRL");
            compatible.add("DLP");
            compatible.add("WHL");
            compatible.add("PLC");
            compatible.add("GSE");
            compatible.add("CRN");
        } else if (_id == "HPP") {
            number = ++hippopotamus_nb;
            legend = ')';
            eat = 0.65;
            type = 'H';
            food = 0.65;
            habitat.add('L');
            habitat.add('W');
            compatible.add("WF");
            compatible.add("ZBR");
            compatible.add("ELP");
            compatible.add("MCQ");
            compatible.add("HG");
            compatible.add("PNG");
            compatible.add("HPP");
            compatible.add("CLG");
            compatible.add("MRE");
            compatible.add("DGG");
            compatible.add("TRL");
            compatible.add("DLP");
            compatible.add("WHL");
            compatible.add("PLC");
            compatible.add("GSE");
            compatible.add("CRN");
        } else if (_id == "PLC") {
            number = ++pelican_nb;
            legend = '`';
            eat = 0.3;
            type = 'K';
            food = 0.3;
            habitat.add('W');
            habitat.add('A');
            compatible.add("MRE");
            compatible.add("DGG");
            compatible.add("DLP");
            compatible.add("WHL");
            compatible.add("PNG");
            compatible.add("HPP");
            compatible.add("PLC");
            compatible.add("GSE");
            compatible.add("CRN");
            compatible.add("EGL");
            compatible.add("OW");
            compatible.add("HMB");
            compatible.add("CKT");
            compatible.add("RBN");
            compatible.add("BT");
            compatible.add("CLG");
            compatible.add("SGL");
        } else if (_id == "GSE") {
            number = ++goose_nb;
            legend = '+';
            eat = 0.3;
            type = 'H';
            food = 0.3;
            habitat.add('W');
            habitat.add('A');
            compatible.add("MRE");
            compatible.add("DGG");
            compatible.add("TRL");
            compatible.add("DLP");
            compatible.add("WHL");
            compatible.add("PNG");
            compatible.add("HPP");
            compatible.add("PLC");
            compatible.add("GSE");
            compatible.add("CRN");
            compatible.add("HMB");
            compatible.add("CKT");
            compatible.add("RBN");
            compatible.add("BT");
            compatible.add("CLG");
            compatible.add("SGL");
        } else if (_id == "CRN") {
            number = ++crane_nb;
            legend = '-';
            eat = 0.3;
            type = 'O';
            food = 0.3;
            habitat.add('W');
            habitat.add('A');
            compatible.add("MRE");
            compatible.add("DGG");
            compatible.add("TRL");
            compatible.add("DLP");
            compatible.add("WHL");
            compatible.add("PNG");
            compatible.add("HPP");
            compatible.add("PLC");
            compatible.add("GSE");
            compatible.add("CRN");
            compatible.add("HMB");
            compatible.add("CKT");
            compatible.add("RBN");
            compatible.add("BT");
            compatible.add("DRL");
            compatible.add("CLG");
            compatible.add("SGL");
        } else if (_id == "DRL") {
            number = ++draco_lizard_nb;
            legend = '=';
            eat = 0.2;
            type = 'K';
            food = 0.2;
            habitat.add('L');
            habitat.add('A');
            compatible.add("ZBR");
            compatible.add("MCQ");
            compatible.add("HG");
            compatible.add("PNG");
            compatible.add("DRL");
            compatible.add("CLG");
            compatible.add("SGL");
            compatible.add("OW");
            compatible.add("RBN");
            compatible.add("GSE");
            compatible.add("CRN");
        } else if (_id == "CLG") {
            number = ++colugo_nb;
            legend = '<';
            eat = 0.25;
            type = 'H';
            food = 0.25;
            habitat.add('L');
            habitat.add('A');
            compatible.add("ZBR");
            compatible.add("MCQ");
            compatible.add("HG");
            compatible.add("PNG");
            compatible.add("HPP");
            compatible.add("DRL");
            compatible.add("CLG");
            compatible.add("SGL");
            compatible.add("HMB");
            compatible.add("CKT");
            compatible.add("RBN");
            compatible.add("GSE");
            compatible.add("CRN");
        } else if (_id == "SGL") {
            number = ++sugar_glider_nb;
            legend = '>';
            eat = 0.5;
            type = 'O';
            food = 0.5;
            habitat.add('L');
            habitat.add('A');
            compatible.add("ZBR");
            compatible.add("MCQ");
            compatible.add("HG");
            compatible.add("PNG");
            compatible.add("DRL");
            compatible.add("CLG");
            compatible.add("SGL");
            compatible.add("HMB");
            compatible.add("GSE");
            compatible.add("CRN");
        }
        else{
        	food = 0.1;
				}
    }
    public final String GetId(){
        return id;
    }
    public final int GetNumber() {
        return number;
    }
    public final double GetWeight() {
        return weight;
    }
    public final double GetEat() {
        return eat;
    }
    public final Pair GetPos() {
        return position;
    }
    public final char GetType() {
        return type;
    }
    public final char GetLegend() {
        return legend;
    }
    public final Set<Character> GetHabitat() {
        return habitat;
    }
    public void SetWeight(double _weight){
        weight = _weight;
    }
    public void SetPos(Pair _position) {
        position.first = _position.first;
        position.second = _position.second;
    }
    public final Set<String> GetCompatible() {
        return compatible;
    }
    public final void Act() {
        System.out.print(id+"-");
        if (number < 10) {
            System.out.print("0");
        }
        System.out.print(number+": ");
        if (id == "WF") {
            System.out.println("*howl*");
        } else if (id == "LI") {
            System.out.println("*roar*");
        } else if (id == "ZBR") {
            System.out.println("*snort*");
        } else if (id == "ELP") {
            System.out.println("*trumpet*");
        } else if (id == "MCQ") {
            System.out.println("*chatter*");
        } else if (id == "HG") {
            System.out.println("*oink*");
        } else if (id == "SHK") {
            System.out.println("*cruise*");
        } else if (id == "MRE") {
            System.out.println("*hide into rocks*");
        } else if (id == "DGG") {
            System.out.println("*splash*");
        } else if (id == "TRL") {
            System.out.println("*swim*");
        } else if (id == "DLP") {
            System.out.println("*click*");
        } else if (id == "WHL") {
            System.out.println("*sing*");
        } else if (id == "EGL") {
            System.out.println("*scream*");
        } else if (id == "OW") {
            System.out.println("*hoot*");
        } else if (id == "HMB") {
            System.out.println("*hum*");
        } else if (id == "CKT") {
            System.out.println("*talk*");
        } else if (id == "RBN") {
            System.out.println("*hoot*");
        } else if (id == "BT") {
            System.out.println("*screech*");
        } else if (id == "PNG") {
            System.out.println("*slide*");
        } else if (id == "HPP") {
            System.out.println("*grunt*");
        } else if (id == "PLC") {
            System.out.println("\"hrraa-hrraa\"");
        } else if (id == "GSE") {
            System.out.println("*quack*");
        } else if (id == "CRN") {
            System.out.println("*soar*");
        } else if (id == "DRL") {
            System.out.println("*jump*");
        } else if (id == "CLG") {
            System.out.println("*glide*");
        } else if (id == "SGL") {
            System.out.println("*crab*");
        }
    }
    public final void Interact() {
        if(id == "WF") {
            Desription("wolf");
        } else if (id == "LI") {
            Desription("lioin");
        } else if (id == "ZBR") {
            Desription("zebra");
        } else if (id == "ELP") {
            Desription("elephant");
        } else if (id == "MCQ") {
            Desription("macaque");
        } else if (id == "HG") {
            Desription("hog");
        } else if (id == "SHK") {
            Desription("shark");
        } else if (id == "MRE") {
            Desription("moray eel");
        } else if (id == "DGG") {
            Desription("dugong");
        } else if (id == "TRL") {
            Desription("turtle");
        } else if (id == "DLP") {
            Desription("dolphin");
        } else if (id == "WHL") {
            Desription("whale");
        } else if (id == "EGL") {
            Desription("eagle");
        } else if (id == "OW") {
            Desription("owl");
        } else if (id == "HMB") {
            Desription("hummingbird");
        } else if (id == "CKT") {
            Desription("cockatoo");
        } else if (id == "RBN") {
            Desription("robin");
        } else if (id == "BT") {
            Desription("bat");
        } else if (id == "PNG") {
            Desription("penguin");
        } else if (id == "HPP") {
            Desription("hippopotamus");
        } else if (id == "PLC") {
            Desription("pelican");
        } else if (id == "GSE") {
            Desription("goose");
        } else if (id == "CRN") {
            Desription("crane");
        } else if (id == "DRL") {
            Desription("draco lizard");
        } else if (id == "CLG") {
            Desription("colugo");
        } else if (id == "SGL") {
            Desription("sugar glider");
        }
        Act();
    }
    public final void Desription(String a) {
      System.out.print("This is a(n) "+a+" called "+id+"-");
      if(number < 10) {
        System.out.print("0");
      }
      System.out.print(number+". It weights "+weight+" kilograms. It eats ");
      System.out.print((eat*weight)+" kilograms of ");
      if (type == 'K') {
        System.out.print("meats");
      } else if (type == 'O') {
        System.out.print("meats and vegetables");
      } else {
        System.out.print("vegetables");
      }
      System.out.println();
    }
    public void Move(int direction) {
      switch(direction){
        case 0:
          position.first--;
          break;
        case 1:
          position.second--;
          break;
        case 2:
          position.second++;
          break;
        case 3:
          position.first++;
          break;
      }
    }
    //atribut
    private String id;
    private int number;
    private char legend;
    private double weight;
    private double eat;
    private char type;
    private Pair position;
    private TreeSet<String> compatible = new TreeSet<String>();
    private TreeSet<Character> habitat = new TreeSet<Character>();
    private double food = 0;
    private static int bat_nb;
    private static int cockatoo_nb;
    private static int colugo_nb;
    private static int crane_nb;
    private static int dolphin_nb;
    private static int draco_lizard_nb;
    private static int dugong_nb;
    private static int eagle_nb;
    private static int elephant_nb;
    private static int goose_nb;
    private static int hippopotamus_nb;
    private static int hog_nb;
    private static int hummingbird_nb;
    private static int lion_nb;
    private static int macaque_nb;
    private static int moray_eel_nb;
    private static int owl_nb;
    private static int pelican_nb;
    private static int penguin_nb;
    private static int robin_nb;
    private static int shark_nb;
    private static int sugar_glider_nb;
    private static int turtle_nb;
    private static int whale_nb;
    private static int wolf_nb;
    private static int zebra_nb;
}
