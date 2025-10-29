package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Long_Q$;
import CC.$.Q2$_LMNt.Q_Short$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Long_Short$ extends
		Long_Q$,
		Q_Short$
{
	Clas_Rap Class=Init_StRt_Nd(Long_Short$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Long_Short$(long A,short B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Longg_Shortg$(long[] Ag,short[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Long_Short$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Longg_Shortg$(Iterable<Long> Ag,Iterable<Short> Bg)
		{
			Iterator<Long> A_Itr=Ag.iterator();
			Iterator<Short> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Long_Short$(A_Itr.next(),B_Itr.next());}
		}
}