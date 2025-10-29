package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.ChR_Q$;
import CC.$.Q2$_LMNt.Q_Bool$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface ChR_Bool$ extends ChR_Q$,Q_Bool$
{
	Clas_Rap Class=Init_StRt_Nd(ChR_Bool$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void ChR_Bool$(char A,boolean B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void ChRg_Boolg$(char[] Ag,boolean[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){ChR_Bool$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void ChRg_Boolg$(Iterable<Character> Ag,Iterable<Boolean> Bg)
		{
			Iterator<Character> A_Itr=Ag.iterator();
			Iterator<Boolean> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){ChR_Bool$(A_Itr.next(),B_Itr.next());}
		}
}