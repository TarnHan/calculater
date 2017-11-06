package onetest;
/*这是相当于MVC里面的Model，这是一个计算器模型*/
public class calculatorModel {
	String strOld=null,strSign=null,strShow="0";//strOld是上一次的数据；strShow是显示的字符串；strSign是符号
	boolean isClickSign=false;//这里是判断上一个是不是确定符号
	/****************此方法确定哪个按钮被触发****************/
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
		if(btnLable=="←"){
			NumberBack();
		}
		if(btnLable=="±"){}
		if(btnLable=="√"){}
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
	
	/*显示数据*/
	public String showNewNum()
	{
		return strShow;
	}
	/*判断输入合法*/
	public void IputuIsTrue(){
		
	}
	
	/*根据原有的显示输出字符*/
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
	/*等于运算*/
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
	/*全部清除归零*/
	public void NumberC(){
		strOld=null;
		strSign=null;
		strShow="0";
	}
	/*清除当前*/
	public void NumberCE(){
		strShow="0";
	}
	/*撤销返回*/
	public void NumberBack(){
		if(strShow.length()==1||strShow.length()==0){
			strShow="0";
		}
		else{
			strShow=strShow.substring(0, strShow.length()-1);
		}
	}
	/*正负号切换*/
	public void NumberSorM(){
	}
	/*求根运算*/
	public void NumberRoot(){
	}
	/*小数点*/
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
	/*加法计算*/
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
	/*减法计算*/
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
	/*乘法计算*/
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
	/*除法计算*/
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
	
	/************这里是字符串与Double类型的转换*************/
	public String DoubleToString(Double dou){
		try{
			String s=dou.toString();
			return s;
		}
		catch(Exception e){
			return "请检查你的输入";
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
	
	/**********运算的计算与判断*********/
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
