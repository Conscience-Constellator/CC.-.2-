package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Long_Q$;
import CC.$.Q2$_LMNt.Q_Long$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Long2$ extends
		Long_Q$,
		Q_Long$
{
	Clas_Rap Class=Init_StRt_Nd(Long2$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Long_Long$(long A,long B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Longg_Longg$(long[] Ag,long[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Long_Long$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Longg_Longg$(Iterable<Long> Ag,Iterable<Long> Bg)
		{
			Iterator<Long> A_Itr=Ag.iterator();
			Iterator<Long> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Long_Long$(A_Itr.next(),B_Itr.next());}
		}
}