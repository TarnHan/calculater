package onetest;
/*�����൱��MVC�����Model������һ��������ģ��*/
public class calculatorModel {
	String strOld=null,strSign=null,strShow="0";//strOld����һ�ε����ݣ�strShow����ʾ���ַ�����strSign�Ƿ���
	boolean isClickSign=false;//�������ж���һ���ǲ���ȷ������
	/****************�˷���ȷ���ĸ���ť������****************/
	public void BtnClick(String btnLable){
		if(btnLable=="0"||btnLable=="1"||btnLable=="2"||btnLable=="3"||btnLable=="4"||btnLable=="5"||btnLable=="6"||btnLable=="7"||btnLable=="8"||btnLable=="9"){
			strShow=ShowNumOfOldNum(strShow,btnLable);
		}
		if(btnLable=="="){
			NumberEqu();
		}
		if(btnLable=="C"){
			NumberC();
		}
		if(btnLable=="CE"){
			NumberCE();
		}
		if(btnLable=="��"){
			NumberBack();
		}
		if(btnLable=="��"){}
		if(btnLable=="��"){}
		if(btnLable=="."){
			NumberDon();
		}
		if(btnLable=="+"){
			NumberAdd();
		}
		if(btnLable=="-"){
			NumberSub();
		}
		if(btnLable=="*"){
			NumberMul();
		}
		if(btnLable=="/"){
			NumberDiv();
		}
	}
	
	/*��ʾ����*/
	public String showNewNum()
	{
		return strShow;
	}
	/*�ж�����Ϸ�*/
	public void IputuIsTrue(){
		
	}
	
	/*����ԭ�е���ʾ����ַ�*/
	public String ShowNumOfOldNum(String OldNum,String InputNum){
		if(OldNum=="0"&&InputNum=="0"){
			return 	"0";
		}
		if(OldNum=="0"){
			return InputNum;
		}
		if(OldNum=="0."){
			return "0."+InputNum;
		}
		if(isClickSign==true)
		{
			isClickSign=false;
			return InputNum;
		}
		else{
			return OldNum+InputNum;
		}
	}
	/*��������*/
	public void NumberEqu(){
		if(strSign==null){
			return;
		}
		else{
			CalculateToString();
			strSign=null;
			strOld=null;
			isClickSign=true;
		}
	}
	/*ȫ���������*/
	public void NumberC(){
		strOld=null;
		strSign=null;
		strShow="0";
	}
	/*�����ǰ*/
	public void NumberCE(){
		strShow="0";
	}
	/*��������*/
	public void NumberBack(){
		if(strShow.length()==1||strShow.length()==0){
			strShow="0";
		}
		else{
			strShow=strShow.substring(0, strShow.length()-1);
		}
	}
	/*�������л�*/
	public void NumberSorM(){
	}
	/*�������*/
	public void NumberRoot(){
	}
	/*С����*/
	public void NumberDon(){
		if(strShow.contains(".")){
			return;
		}
		if(isClickSign==true)
		{
			isClickSign=false;
			strShow="0.";
		}
		else{
			strShow=strShow+".";
		}
	}
	/*�ӷ�����*/
	public void NumberAdd(){
		if(strSign==null&&strOld==null){
			strSign="+";
			strOld=strShow;
			isClickSign=true;
		}
		else if(strSign!=null&&strOld!=null){
			CalculateToString();
			isClickSign=true;
		}
	}
	/*��������*/
	public void NumberSub(){
		if(strSign==null&&strOld==null){
			strSign="-";
			strOld=strShow;
			isClickSign=true;
		}
		else if(strSign!=null&&strOld!=null){
			CalculateToString();
			isClickSign=true;
		}
	}
	/*�˷�����*/
	public void NumberMul(){
		if(strSign==null&&strOld==null){
			strSign="*";
			strOld=strShow;
			isClickSign=true;
		}
		else if(strSign!=null&&strOld!=null){
			CalculateToString();
			isClickSign=true;
		}
	}
	/*��������*/
	public void NumberDiv(){
		if(strSign==null&&strOld==null){
			strSign="/";
			strOld=strShow;
			isClickSign=true;
		}
		else if(strSign!=null&&strOld!=null){
			CalculateToString();
			isClickSign=true;
		}
	}
	
	/************�������ַ�����Double���͵�ת��*************/
	public String DoubleToString(Double dou){
		try{
			String s=dou.toString();
			return s;
		}
		catch(Exception e){
			return "�����������";
		}
	}
	public double StringToDouble(String s){
		try{
			double dou=Double.parseDouble(s.trim());
			return dou;
		}
		catch(Exception e){
			return 0;
		}
	}
	
	/**********����ļ������ж�*********/
	public void CalculateToString(){
		double dou;
		double douOld=StringToDouble(strOld);
		double douShow=StringToDouble(strShow);
		if(strSign=="+"){
			dou=douOld+douShow;
			strShow=DoubleToString(dou);
			strOld=strShow;
		}
		if(strSign=="-"){
			dou=douOld-douShow;
			strShow=DoubleToString(dou);
			strOld=strShow;
		}
		if(strSign=="*"){
			dou=douOld*douShow;
			strShow=DoubleToString(dou);
			strOld=strShow;
		}
		if(strSign=="/"){
			dou=douOld/douShow;
			strShow=DoubleToString(dou);
			strOld=strShow;
		}
	}
}
