package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.$.Q2$_LMNt.Q_Flot$;
import CC.$.Q2$_LMNt.Short_Q$;
import java.util.Iterator;

public interface Short_Flot$ extends
	Short_Q$,
	Q_Flot$
{
	Clas_Rap Class=Init_StRt_Nd(Short_Flot$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Short_Flot$(short A,float B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Shortg_Flotg$(short[] Ag,float[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Short_Flot$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Shortg_Flotg$(Iterable<Short> Ag,Iterable<Float> Bg)
		{
			Iterator<Short> A_Itr=Ag.iterator();
			Iterator<Float> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Short_Flot$(A_Itr.next(),B_Itr.next());}
		}
}