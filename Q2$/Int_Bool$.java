package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Int_Q$;
import CC.$.Q2$_LMNt.Q_Bool$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Int_Bool$ extends
		Int_Q$,
		Q_Bool$
{
	Clas_Rap Class=Init_StRt_Nd(Int_Bool$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Int_Bool$(int A,boolean B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Intg_Boolg$(int[] Ag,boolean[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Int_Bool$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Intg_Boolg$(Iterable<Integer> Ag,Iterable<Boolean> Bg)
		{
			Iterator<Integer> A_Itr=Ag.iterator();
			Iterator<Boolean> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Int_Bool$(A_Itr.next(),B_Itr.next());}
		}
}