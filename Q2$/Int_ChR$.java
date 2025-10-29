package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Int_Q$;
import CC.$.Q2$_LMNt.Q_ChR$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Int_ChR$ extends
		Int_Q$,
		Q_ChR$
{
	Clas_Rap Class=Init_StRt_Nd(Int_ChR$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Int_ChR$(int A,char B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Intg_ChRg$(int[] Ag,char[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Int_ChR$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Intg_ChRg$(Iterable<Integer> Ag,Iterable<Character> Bg)
		{
			Iterator<Integer> A_Itr=Ag.iterator();
			Iterator<Character> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Int_ChR$(A_Itr.next(),B_Itr.next());}
		}
}