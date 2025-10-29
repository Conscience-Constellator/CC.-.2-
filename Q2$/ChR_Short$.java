package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.ChR_Q$;
import CC.$.Q2$_LMNt.Q_Short$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface ChR_Short$ extends ChR_Q$,Q_Short$
{
	Clas_Rap Class=Init_StRt_Nd(ChR_Short$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void ChR_Short$(char A,short B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void ChRg_Shortg$(char[] Ag,short[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){ChR_Short$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void ChRg_Shortg$(Iterable<Character> Ag,Iterable<Short> Bg)
		{
			Iterator<Character> A_Itr=Ag.iterator();
			Iterator<Short> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){ChR_Short$(A_Itr.next(),B_Itr.next());}
		}
}