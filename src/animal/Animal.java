package animal;
import java.util.HashSet;
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
        position = new Pair(_position.first, _position.second);
        if(_id.equals("WF")) {
            wolf_nb++;
            food = 0.2;
            weight = 45;
            compatible.add(new String("WF"));
            compatible.add(new String("ELP"));
            compatible.add(new String("HPP"));
            habitat.add(new Character('L'));
        } else if (_id.equals("LI")) {
            lion_nb++;
            food = 0.5;
            weight = 158;
            compatible.add(new String("LI"));
            habitat.add(new Character('L'));
        } else if (_id.equals("ZBR")) {
            zebra_nb++;
            food = 0.3;
            weight = 226;
            compatible.add(new String("ZBR"));
            compatible.add(new String("ELP"));
            compatible.add(new String("MCQ"));
            compatible.add(new String("HG"));
            compatible.add(new String("PNG"));
            compatible.add(new String("HPP"));
            compatible.add(new String("DRL"));
            compatible.add(new String("CLG"));
            compatible.add(new String("SGL"));
            habitat.add(new Character('L'));
        } else if (_id.equals("ELP")) {
            elephant_nb++;
            food = 0.7;
            weight = 5000;
            habitat.add(new Character('L'));
            compatible.add(new String("WF"));
            compatible.add(new String("ZBR"));
            compatible.add(new String("ELP"));
            compatible.add(new String("MCQ"));
            compatible.add(new String("HG"));
            compatible.add(new String("PNG"));
            compatible.add(new String("HPP"));
        } else if (_id.equals("MCQ")) {
            macaque_nb++;
            food=0.2;
            weight = 9;
            habitat.add(new Character('L'));
            compatible.add(new String("ZBR"));
            compatible.add(new String("ELP"));
            compatible.add(new String("MCQ"));
            compatible.add(new String("HG"));
            compatible.add(new String("HPP"));
            compatible.add(new String("DRL"));
            compatible.add(new String("CLG"));
            compatible.add(new String("SGL"));
        } else if (_id.equals("HG")) {
            hog_nb++;
            food = 0.2;
            weight = 68;
            habitat.add(new Character('L'));
            compatible.add(new String("ZBR"));
            compatible.add(new String("ELP"));
            compatible.add(new String("MCQ"));
            compatible.add(new String("HG"));
            compatible.add(new String("HPP"));
        } else if (_id.equals("SHK")) {
            shark_nb++;
            food = 0.2;
            weight = 771;
            habitat.add(new Character('W'));
            compatible.add(new String("SHK"));
            compatible.add(new String("WHL"));
        } else if (_id.equals("MRE")) {
            moray_eel_nb++;
            food = 0.2;
            weight = 13;
            habitat.add(new Character('W'));
            compatible.add(new String("MRE"));
            compatible.add(new String("DGG"));
            compatible.add(new String("TRL"));
            compatible.add(new String("DLP"));
            compatible.add(new String("WHL"));
            compatible.add(new String("HPP"));
        } else if (_id.equals("DGG")) {
            dugong_nb++;
            food = 0.2;
            weight = 294;
            habitat.add(new Character('W'));
            compatible.add(new String("MRE"));
            compatible.add(new String("DGG"));
            compatible.add(new String("TRL"));
            compatible.add(new String("DLP"));
            compatible.add(new String("WHL"));
            compatible.add(new String("PNG"));
            compatible.add(new String("HPP"));
            compatible.add(new String("PLC"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
        } else if (_id.equals("TRL")) {
            turtle_nb++;
            food = 0.05;
            weight = 453;
            habitat.add(new Character('W'));
            compatible.add(new String("MRE"));
            compatible.add(new String("DGG"));
            compatible.add(new String("TRL"));
            compatible.add(new String("DLP"));
            compatible.add(new String("WHL"));
            compatible.add(new String("PNG"));
            compatible.add(new String("HPP"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
        } else if (_id.equals("DLP")) {
            dolphin_nb++;
            food = 0.2;
            weight = 220;
            habitat.add(new Character('W'));
            compatible.add(new String("MRE"));
            compatible.add(new String("DGG"));
            compatible.add(new String("TRL"));
            compatible.add(new String("DLP"));
            compatible.add(new String("WHL"));
            compatible.add(new String("PNG"));
            compatible.add(new String("HPP"));
            compatible.add(new String("PLC"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
        } else if (_id.equals("WHL")) {
            whale_nb++;
            food = 0.1;
            weight = 40000;
            habitat.add(new Character('W'));
            compatible.add(new String("SHK"));
            compatible.add(new String("MRE"));
            compatible.add(new String("DGG"));
            compatible.add(new String("TRL"));
            compatible.add(new String("DLP"));
            compatible.add(new String("WHL"));
            compatible.add(new String("PNG"));
            compatible.add(new String("HPP"));
            compatible.add(new String("PLC"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
        } else if (_id.equals("EGL")) {
            eagle_nb++;
            food = 0.7;
            weight = 4;
            habitat.add(new Character('A'));
            compatible.add(new String("EGL"));
            compatible.add(new String("OW"));
            compatible.add(new String("PLC"));
        } else if (_id.equals("OW")) {
            owl_nb++;
            food = 0.3;
            weight = 2;
            habitat.add(new Character('A'));
            compatible.add(new String("EGL"));
            compatible.add(new String("OW"));
            compatible.add(new String("PLC"));
            compatible.add(new String("DRL"));
        } else if (_id.equals("HMB")) {
            hummingbird_nb++;
            food = 0.3;
            weight = 0.0002;
            habitat.add(new Character('A'));
            compatible.add(new String("HMB"));
            compatible.add(new String("CKT"));
            compatible.add(new String("RBN"));
            compatible.add(new String("BT"));
            compatible.add(new String("PLC"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
            compatible.add(new String("CLG"));
            compatible.add(new String("SGL"));
        } else if (_id.equals("CKT")) {
            cockatoo_nb++;
            food = 0.3;
            weight = 0.09;
            habitat.add(new Character('A'));
            compatible.add(new String("HMB"));
            compatible.add(new String("CKT"));
            compatible.add(new String("RBN"));
            compatible.add(new String("BT"));
            compatible.add(new String("PLC"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
            compatible.add(new String("CLG"));
        } else if (_id.equals("RBN")) {
            robin_nb++;
            food = 0.3;
            weight = 0.06;
            habitat.add(new Character('A'));
            compatible.add(new String("HMB"));
            compatible.add(new String("CKT"));
            compatible.add(new String("RBN"));
            compatible.add(new String("BT"));
            compatible.add(new String("PLC"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
            compatible.add(new String("CLG"));
            compatible.add(new String("DRL"));
        } else if (_id.equals("BT")) {
            bat_nb++;
            food = 0.4;
            weight = 0.15;
            habitat.add(new Character('A'));
            compatible.add(new String("HMB"));
            compatible.add(new String("CKT"));
            compatible.add(new String("RBN"));
            compatible.add(new String("BT"));
            compatible.add(new String("PLC"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
        } else if (_id.equals("PNG")) {
            penguin_nb++;
            food = 0.25;
            weight = 22;
            habitat.add(new Character('L'));
            habitat.add(new Character('W'));
            compatible.add(new String("ZBR"));
            compatible.add(new String("ELP"));
            compatible.add(new String("PNG"));
            compatible.add(new String("HPP"));
            compatible.add(new String("DRL"));
            compatible.add(new String("CLG"));
            compatible.add(new String("SGL"));
            compatible.add(new String("DGG"));
            compatible.add(new String("TRL"));
            compatible.add(new String("DLP"));
            compatible.add(new String("WHL"));
            compatible.add(new String("PLC"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
        } else if (_id.equals("HPP")) {
            hippopotamus_nb++;
            food = 0.65;
            weight = 1496;
            habitat.add(new Character('L'));
            habitat.add(new Character('W'));
            compatible.add(new String("WF"));
            compatible.add(new String("ZBR"));
            compatible.add(new String("ELP"));
            compatible.add(new String("MCQ"));
            compatible.add(new String("HG"));
            compatible.add(new String("PNG"));
            compatible.add(new String("HPP"));
            compatible.add(new String("CLG"));
            compatible.add(new String("MRE"));
            compatible.add(new String("DGG"));
            compatible.add(new String("TRL"));
            compatible.add(new String("DLP"));
            compatible.add(new String("WHL"));
            compatible.add(new String("PLC"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
        } else if (_id.equals("PLC")) {
            pelican_nb++;
            food = 0.3;
            weight = 7;
            habitat.add(new Character('W'));
            habitat.add(new Character('A'));
            compatible.add(new String("MRE"));
            compatible.add(new String("DGG"));
            compatible.add(new String("DLP"));
            compatible.add(new String("WHL"));
            compatible.add(new String("PNG"));
            compatible.add(new String("HPP"));
            compatible.add(new String("PLC"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
            compatible.add(new String("EGL"));
            compatible.add(new String("OW"));
            compatible.add(new String("HMB"));
            compatible.add(new String("CKT"));
            compatible.add(new String("RBN"));
            compatible.add(new String("BT"));
            compatible.add(new String("CLG"));
            compatible.add(new String("SGL"));
        } else if (_id.equals("GSE")) {
            goose_nb++;
            food = 0.3;
            weight = 4;
            habitat.add(new Character('W'));
            habitat.add(new Character('A'));
            compatible.add(new String("MRE"));
            compatible.add(new String("DGG"));
            compatible.add(new String("TRL"));
            compatible.add(new String("DLP"));
            compatible.add(new String("WHL"));
            compatible.add(new String("PNG"));
            compatible.add(new String("HPP"));
            compatible.add(new String("PLC"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
            compatible.add(new String("HMB"));
            compatible.add(new String("CKT"));
            compatible.add(new String("RBN"));
            compatible.add(new String("BT"));
            compatible.add(new String("CLG"));
            compatible.add(new String("SGL"));
        } else if (_id.equals("CRN")) {
            crane_nb++;
            food = 0.3;
            weight = 3;
            habitat.add(new Character('W'));
            habitat.add(new Character('A'));
            compatible.add(new String("MRE"));
            compatible.add(new String("DGG"));
            compatible.add(new String("TRL"));
            compatible.add(new String("DLP"));
            compatible.add(new String("WHL"));
            compatible.add(new String("PNG"));
            compatible.add(new String("HPP"));
            compatible.add(new String("PLC"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
            compatible.add(new String("HMB"));
            compatible.add(new String("CKT"));
            compatible.add(new String("RBN"));
            compatible.add(new String("BT"));
            compatible.add(new String("DRL"));
            compatible.add(new String("CLG"));
            compatible.add(new String("SGL"));
        } else if (_id.equals("DRL")) {
            draco_lizard_nb++;
            food = 0.2;
            weight = 0.2;
            habitat.add(new Character('L'));
            habitat.add(new Character('A'));
            compatible.add(new String("ZBR"));
            compatible.add(new String("MCQ"));
            compatible.add(new String("HG"));
            compatible.add(new String("PNG"));
            compatible.add(new String("DRL"));
            compatible.add(new String("CLG"));
            compatible.add(new String("SGL"));
            compatible.add(new String("OW"));
            compatible.add(new String("RBN"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
        } else if (_id.equals("CLG")) {
            colugo_nb++;
            food = 0.25;
            weight = 0.035;
            habitat.add(new Character('L'));
            habitat.add(new Character('A'));
            compatible.add(new String("ZBR"));
            compatible.add(new String("MCQ"));
            compatible.add(new String("HG"));
            compatible.add(new String("PNG"));
            compatible.add(new String("HPP"));
            compatible.add(new String("DRL"));
            compatible.add(new String("CLG"));
            compatible.add(new String("SGL"));
            compatible.add(new String("HMB"));
            compatible.add(new String("CKT"));
            compatible.add(new String("RBN"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
        } else if (_id.equals("SGL")) {
            sugar_glider_nb++;
            food = 0.5;
            weight = 0.12;
            habitat.add(new Character('L'));
            habitat.add(new Character('A'));
            compatible.add(new String("ZBR"));
            compatible.add(new String("MCQ"));
            compatible.add(new String("HG"));
            compatible.add(new String("PNG"));
            compatible.add(new String("DRL"));
            compatible.add(new String("CLG"));
            compatible.add(new String("SGL"));
            compatible.add(new String("HMB"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
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
				position = new Pair(_position.first, _position.second);
        if(_id.equals("WF")) {
        		number = ++wolf_nb; // ini jadi gini
        		legend = '1'; // ini juga
        		eat = 0.2; // ini diambil dari wolf.cpp yang dlu diliat isinya berapa
						type = 'K'; // ini juga diliat
            food = 0.2;
            compatible.add(new String("WF"));
            compatible.add(new String("ELP"));
            compatible.add(new String("HPP"));
            habitat.add(new Character('L'));
        } else if (_id.equals("LI")) {
            number = ++lion_nb;
            legend = '2';
            eat = 0.5;
            type = 'K';
            food = 0.5;
            compatible.add(new String("LI"));
            habitat.add(new Character('L'));
        } else if (_id.equals("ZBR")) {
            number = ++zebra_nb;
            legend = '3';
            eat = 0.3;
            type = 'H';
            food = 0.3;
            compatible.add(new String("ZBR"));
            compatible.add(new String("ELP"));
            compatible.add(new String("MCQ"));
            compatible.add(new String("HG"));
            compatible.add(new String("PNG"));
            compatible.add(new String("HPP"));
            compatible.add(new String("DRL"));
            compatible.add(new String("CLG"));
            compatible.add(new String("SGL"));
            habitat.add(new Character('L'));
        } else if (_id.equals("ELP")) {
            number = ++elephant_nb;
            legend = '4';
            eat = 0.7;
            type = 'H';
            food = 0.7;
            habitat.add(new Character('L'));
            compatible.add(new String("WF"));
            compatible.add(new String("ZBR"));
            compatible.add(new String("ELP"));
            compatible.add(new String("MCQ"));
            compatible.add(new String("HG"));
            compatible.add(new String("PNG"));
            compatible.add(new String("HPP"));
        } else if (_id.equals("MCQ")) {
            number = ++macaque_nb;
            legend = '5';
            eat = 0.2;
            type = 'O';
            food=0.2;
            habitat.add(new Character('L'));
            compatible.add(new String("ZBR"));
            compatible.add(new String("ELP"));
            compatible.add(new String("MCQ"));
            compatible.add(new String("HG"));
            compatible.add(new String("HPP"));
            compatible.add(new String("DRL"));
            compatible.add(new String("CLG"));
            compatible.add(new String("SGL"));
        } else if (_id.equals("HG")) {
            number = ++hog_nb;
            legend = '6';
            eat = 0.2;
            type = 'O';
            food = 0.2;
            habitat.add(new Character('L'));
            compatible.add(new String("ZBR"));
            compatible.add(new String("ELP"));
            compatible.add(new String("MCQ"));
            compatible.add(new String("HG"));
            compatible.add(new String("HPP"));
        } else if (_id.equals("SHK")) {
            number = ++shark_nb;
            legend = '7';
            eat = 0.2;
            type = 'K';
            food = 0.2;
            habitat.add(new Character('W'));
            compatible.add(new String("SHK"));
            compatible.add(new String("WHL"));
        } else if (_id.equals("MRE")) {
            number = ++moray_eel_nb;
            legend = '8';
            eat = 0.2;
            type = 'K';
            food = 0.2;
            habitat.add(new Character('W'));
            compatible.add(new String("MRE"));
            compatible.add(new String("DGG"));
            compatible.add(new String("TRL"));
            compatible.add(new String("DLP"));
            compatible.add(new String("WHL"));
            compatible.add(new String("HPP"));
        } else if (_id.equals("DGG")) {
            number = ++dugong_nb;
            legend = '9';
            eat = 0.2;
            type = 'H';
            food = 0.2;
            habitat.add(new Character('W'));
            compatible.add(new String("MRE"));
            compatible.add(new String("DGG"));
            compatible.add(new String("TRL"));
            compatible.add(new String("DLP"));
            compatible.add(new String("WHL"));
            compatible.add(new String("PNG"));
            compatible.add(new String("HPP"));
            compatible.add(new String("PLC"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
        } else if (_id.equals("TRL")) {
            number = ++turtle_nb;
            legend = '0';
            eat = 0.05;
            type = 'H';
            food = 0.05;
            habitat.add(new Character('W'));
            compatible.add(new String("MRE"));
            compatible.add(new String("DGG"));
            compatible.add(new String("TRL"));
            compatible.add(new String("DLP"));
            compatible.add(new String("WHL"));
            compatible.add(new String("PNG"));
            compatible.add(new String("HPP"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
        } else if (_id.equals("DLP")) {
            number = ++dolphin_nb;
            legend = '!';
            eat = 0.2;
            type = 'K';
            food = 0.2;
            habitat.add(new Character('W'));
            compatible.add(new String("MRE"));
            compatible.add(new String("DGG"));
            compatible.add(new String("TRL"));
            compatible.add(new String("DLP"));
            compatible.add(new String("WHL"));
            compatible.add(new String("PNG"));
            compatible.add(new String("HPP"));
            compatible.add(new String("PLC"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
        } else if (_id.equals("WHL")) {
            number = ++whale_nb;
            legend = '@';
            eat = 0.1;
            type = 'O';
            food = 0.1;
            habitat.add(new Character('W'));
            compatible.add(new String("SHK"));
            compatible.add(new String("MRE"));
            compatible.add(new String("DGG"));
            compatible.add(new String("TRL"));
            compatible.add(new String("DLP"));
            compatible.add(new String("WHL"));
            compatible.add(new String("PNG"));
            compatible.add(new String("HPP"));
            compatible.add(new String("PLC"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
        } else if (_id.equals("EGL")) {
            number = ++eagle_nb;
            legend = '#';
            eat = 0.7;
            type = 'K';
            food = 0.7;
            habitat.add(new Character('A'));
            compatible.add(new String("EGL"));
            compatible.add(new String("OW"));
            compatible.add(new String("PLC"));
        } else if (_id.equals("OW")) {
            number = ++owl_nb;
            legend = '$';
            eat = 0.3;
            type = 'K';
            food = 0.3;
            habitat.add(new Character('A'));
            compatible.add(new String("EGL"));
            compatible.add(new String("OW"));
            compatible.add(new String("PLC"));
            compatible.add(new String("DRL"));
        } else if (_id.equals("HMB")) {
            number = ++hummingbird_nb;
            legend = '%';
            eat = 0.3;
            type = 'H';
            food = 0.3;
            habitat.add(new Character('A'));
            compatible.add(new String("HMB"));
            compatible.add(new String("CKT"));
            compatible.add(new String("RBN"));
            compatible.add(new String("BT"));
            compatible.add(new String("PLC"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
            compatible.add(new String("CLG"));
            compatible.add(new String("SGL"));
        } else if (_id.equals("CKT")) {
            number = ++cockatoo_nb;
            legend = '^';
            eat = 0.3;
            type = 'H';
            food = 0.3;
            habitat.add(new Character('A'));
            compatible.add(new String("HMB"));
            compatible.add(new String("CKT"));
            compatible.add(new String("RBN"));
            compatible.add(new String("BT"));
            compatible.add(new String("PLC"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
            compatible.add(new String("CLG"));
        } else if (_id.equals("RBN")) {
            number = ++robin_nb;
            legend = '&';
            eat = 0.3;
            type = 'O';
            food = 0.3;
            habitat.add(new Character('A'));
            compatible.add(new String("HMB"));
            compatible.add(new String("CKT"));
            compatible.add(new String("RBN"));
            compatible.add(new String("BT"));
            compatible.add(new String("PLC"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
            compatible.add(new String("CLG"));
            compatible.add(new String("DRL"));
        } else if (_id.equals("BT")) {
            number = ++bat_nb;
            legend = '*';
            eat = 0.4;
            type = 'O';
            food = 0.4;
            habitat.add(new Character('A'));
            compatible.add(new String("HMB"));
            compatible.add(new String("CKT"));
            compatible.add(new String("RBN"));
            compatible.add(new String("BT"));
            compatible.add(new String("PLC"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
        } else if (_id.equals("PNG")) {
            number = ++penguin_nb;
            legend = '(';
            eat = 0.25;
            type = 'K';
            food = 0.25;
            habitat.add(new Character('L'));
            habitat.add(new Character('W'));
            compatible.add(new String("ZBR"));
            compatible.add(new String("ELP"));
            compatible.add(new String("PNG"));
            compatible.add(new String("HPP"));
            compatible.add(new String("DRL"));
            compatible.add(new String("CLG"));
            compatible.add(new String("SGL"));
            compatible.add(new String("DGG"));
            compatible.add(new String("TRL"));
            compatible.add(new String("DLP"));
            compatible.add(new String("WHL"));
            compatible.add(new String("PLC"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
        } else if (_id.equals("HPP")) {
            number = ++hippopotamus_nb;
            legend = ')';
            eat = 0.65;
            type = 'H';
            food = 0.65;
            habitat.add(new Character('L'));
            habitat.add(new Character('W'));
            compatible.add(new String("WF"));
            compatible.add(new String("ZBR"));
            compatible.add(new String("ELP"));
            compatible.add(new String("MCQ"));
            compatible.add(new String("HG"));
            compatible.add(new String("PNG"));
            compatible.add(new String("HPP"));
            compatible.add(new String("CLG"));
            compatible.add(new String("MRE"));
            compatible.add(new String("DGG"));
            compatible.add(new String("TRL"));
            compatible.add(new String("DLP"));
            compatible.add(new String("WHL"));
            compatible.add(new String("PLC"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
        } else if (_id.equals("PLC")) {
            number = ++pelican_nb;
            legend = '`';
            eat = 0.3;
            type = 'K';
            food = 0.3;
            habitat.add(new Character('W'));
            habitat.add(new Character('A'));
            compatible.add(new String("MRE"));
            compatible.add(new String("DGG"));
            compatible.add(new String("DLP"));
            compatible.add(new String("WHL"));
            compatible.add(new String("PNG"));
            compatible.add(new String("HPP"));
            compatible.add(new String("PLC"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
            compatible.add(new String("EGL"));
            compatible.add(new String("OW"));
            compatible.add(new String("HMB"));
            compatible.add(new String("CKT"));
            compatible.add(new String("RBN"));
            compatible.add(new String("BT"));
            compatible.add(new String("CLG"));
            compatible.add(new String("SGL"));
        } else if (_id.equals("GSE")) {
            number = ++goose_nb;
            legend = '+';
            eat = 0.3;
            type = 'H';
            food = 0.3;
            habitat.add(new Character('W'));
            habitat.add(new Character('A'));
            compatible.add(new String("MRE"));
            compatible.add(new String("DGG"));
            compatible.add(new String("TRL"));
            compatible.add(new String("DLP"));
            compatible.add(new String("WHL"));
            compatible.add(new String("PNG"));
            compatible.add(new String("HPP"));
            compatible.add(new String("PLC"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
            compatible.add(new String("HMB"));
            compatible.add(new String("CKT"));
            compatible.add(new String("RBN"));
            compatible.add(new String("BT"));
            compatible.add(new String("CLG"));
            compatible.add(new String("SGL"));
        } else if (_id.equals("CRN")) {
            number = ++crane_nb;
            legend = '-';
            eat = 0.3;
            type = 'O';
            food = 0.3;
            habitat.add(new Character('W'));
            habitat.add(new Character('A'));
            compatible.add(new String("MRE"));
            compatible.add(new String("DGG"));
            compatible.add(new String("TRL"));
            compatible.add(new String("DLP"));
            compatible.add(new String("WHL"));
            compatible.add(new String("PNG"));
            compatible.add(new String("HPP"));
            compatible.add(new String("PLC"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
            compatible.add(new String("HMB"));
            compatible.add(new String("CKT"));
            compatible.add(new String("RBN"));
            compatible.add(new String("BT"));
            compatible.add(new String("DRL"));
            compatible.add(new String("CLG"));
            compatible.add(new String("SGL"));
        } else if (_id.equals("DRL")) {
            number = ++draco_lizard_nb;
            legend = '=';
            eat = 0.2;
            type = 'K';
            food = 0.2;
            habitat.add(new Character('L'));
            habitat.add(new Character('A'));
            compatible.add(new String("ZBR"));
            compatible.add(new String("MCQ"));
            compatible.add(new String("HG"));
            compatible.add(new String("PNG"));
            compatible.add(new String("DRL"));
            compatible.add(new String("CLG"));
            compatible.add(new String("SGL"));
            compatible.add(new String("OW"));
            compatible.add(new String("RBN"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
        } else if (_id.equals("CLG")) {
            number = ++colugo_nb;
            legend = '<';
            eat = 0.25;
            type = 'H';
            food = 0.25;
            habitat.add(new Character('L'));
            habitat.add(new Character('A'));
            compatible.add(new String("ZBR"));
            compatible.add(new String("MCQ"));
            compatible.add(new String("HG"));
            compatible.add(new String("PNG"));
            compatible.add(new String("HPP"));
            compatible.add(new String("DRL"));
            compatible.add(new String("CLG"));
            compatible.add(new String("SGL"));
            compatible.add(new String("HMB"));
            compatible.add(new String("CKT"));
            compatible.add(new String("RBN"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
        } else if (_id.equals("SGL")) {
            number = ++sugar_glider_nb;
            legend = '>';
            eat = 0.5;
            type = 'O';
            food = 0.5;
            habitat.add(new Character('L'));
            habitat.add(new Character('A'));
            compatible.add(new String("ZBR"));
            compatible.add(new String("MCQ"));
            compatible.add(new String("HG"));
            compatible.add(new String("PNG"));
            compatible.add(new String("DRL"));
            compatible.add(new String("CLG"));
            compatible.add(new String("SGL"));
            compatible.add(new String("HMB"));
            compatible.add(new String("GSE"));
            compatible.add(new String("CRN"));
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
    public final HashSet<Character> GetHabitat() {
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
        if (id.equals("WF")) {
            System.out.println("*howl*");
        } else if (id.equals("LI")) {
            System.out.println("*roar*");
        } else if (id.equals("ZBR")) {
            System.out.println("*snort*");
        } else if (id.equals("ELP")) {
            System.out.println("*trumpet*");
        } else if (id.equals("MCQ")) {
            System.out.println("*chatter*");
        } else if (id.equals("HG")) {
            System.out.println("*oink*");
        } else if (id.equals("SHK")) {
            System.out.println("*cruise*");
        } else if (id.equals("MRE")) {
            System.out.println("*hide into rocks*");
        } else if (id.equals("DGG")) {
            System.out.println("*splash*");
        } else if (id.equals("TRL")) {
            System.out.println("*swim*");
        } else if (id.equals("DLP")) {
            System.out.println("*click*");
        } else if (id.equals("WHL")) {
            System.out.println("*sing*");
        } else if (id.equals("EGL")) {
            System.out.println("*scream*");
        } else if (id.equals("OW")) {
            System.out.println("*hoot*");
        } else if (id.equals("HMB")) {
            System.out.println("*hum*");
        } else if (id.equals("CKT")) {
            System.out.println("*talk*");
        } else if (id.equals("RBN")) {
            System.out.println("*hoot*");
        } else if (id.equals("BT")) {
            System.out.println("*screech*");
        } else if (id.equals("PNG")) {
            System.out.println("*slide*");
        } else if (id.equals("HPP")) {
            System.out.println("*grunt*");
        } else if (id.equals("PLC")) {
            System.out.println("\"hrraa-hrraa\"");
        } else if (id.equals("GSE")) {
            System.out.println("*quack*");
        } else if (id.equals("CRN")) {
            System.out.println("*soar*");
        } else if (id.equals("DRL")) {
            System.out.println("*jump*");
        } else if (id.equals("CLG")) {
            System.out.println("*glide*");
        } else if (id.equals("SGL")) {
            System.out.println("*crab*");
        }
    }
    public final void Interact() {
        if(id.equals("WF")) {
            Desription("wolf");
        } else if (id.equals("LI")) {
            Desription("lioin");
        } else if (id.equals("ZBR")) {
            Desription("zebra");
        } else if (id.equals("ELP")) {
            Desription("elephant");
        } else if (id.equals("MCQ")) {
            Desription("macaque");
        } else if (id.equals("HG")) {
            Desription("hog");
        } else if (id.equals("SHK")) {
            Desription("shark");
        } else if (id.equals("MRE")) {
            Desription("moray eel");
        } else if (id.equals("DGG")) {
            Desription("dugong");
        } else if (id.equals("TRL")) {
            Desription("turtle");
        } else if (id.equals("DLP")) {
            Desription("dolphin");
        } else if (id.equals("WHL")) {
            Desription("whale");
        } else if (id.equals("EGL")) {
            Desription("eagle");
        } else if (id.equals("OW")) {
            Desription("owl");
        } else if (id.equals("HMB")) {
            Desription("hummingbird");
        } else if (id.equals("CKT")) {
            Desription("cockatoo");
        } else if (id.equals("RBN")) {
            Desription("robin");
        } else if (id.equals("BT")) {
            Desription("bat");
        } else if (id.equals("PNG")) {
            Desription("penguin");
        } else if (id.equals("HPP")) {
            Desription("hippopotamus");
        } else if (id.equals("PLC")) {
            Desription("pelican");
        } else if (id.equals("GSE")) {
            Desription("goose");
        } else if (id.equals("CRN")) {
            Desription("crane");
        } else if (id.equals("DRL")) {
            Desription("draco lizard");
        } else if (id.equals("CLG")) {
            Desription("colugo");
        } else if (id.equals("SGL")) {
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
          (position.first)--;
          break;
        case 1:
          (position.second)--;
          break;
        case 2:
          (position.second)++;
          break;
        case 3:
          (position.first)++;
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
    private Pair position = new Pair();
    private HashSet<String> compatible = new HashSet<String>();
    private HashSet<Character> habitat = new HashSet<Character>();
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
