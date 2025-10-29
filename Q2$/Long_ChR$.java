package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Long_Q$;
import CC.$.Q2$_LMNt.Q_ChR$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Long_ChR$ extends
		Long_Q$,
		Q_ChR$
{
	Clas_Rap Class=Init_StRt_Nd(Long_ChR$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Long_ChR$(long A,char B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Longg_ChRg$(long[] Ag,char[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Long_ChR$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Longg_ChRg$(Iterable<Long> Ag,Iterable<Character> Bg)
		{
			Iterator<Long> A_Itr=Ag.iterator();
			Iterator<Character> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Long_ChR$(A_Itr.next(),B_Itr.next());}
		}
}