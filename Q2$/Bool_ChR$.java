package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Bool_Q$;
import CC.$.Q2$_LMNt.Q_ChR$;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import java.util.Iterator;

public interface Bool_ChR$ extends Bool_Q$,Q_ChR$
{
	Clas_Rap Class=Init_StRt_Nd(Bool_ChR$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	void Bool_ChR$(boolean A,char B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Boolg_ChRg$(boolean[] Ag,char[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Bool_ChR$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Boolg_ChRg$(Iterable<Boolean> Ag,Iterable<Character> Bg)
		{
			Iterator<Boolean> A_Itr=Ag.iterator();
			Iterator<Character> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Bool_ChR$(A_Itr.next(),B_Itr.next());}
		}
}