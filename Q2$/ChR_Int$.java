package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.ChR_Q$;
import CC.$.Q2$_LMNt.Q_Int$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface ChR_Int$ extends ChR_Q$,Q_Int$
{
	Clas_Rap Class=Init_StRt_Nd(ChR_Int$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void ChR_Int$(char A,int B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void ChRg_Intg$(char[] Ag,int[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){ChR_Int$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void ChRg_Intg$(Iterable<Character> Ag,Iterable<Integer> Bg)
		{
			Iterator<Character> A_Itr=Ag.iterator();
			Iterator<Integer> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){ChR_Int$(A_Itr.next(),B_Itr.next());}
		}
}