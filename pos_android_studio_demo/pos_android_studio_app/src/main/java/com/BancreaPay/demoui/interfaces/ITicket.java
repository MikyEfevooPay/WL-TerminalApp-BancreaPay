package com.BancreaPay.demoui.interfaces;

import com.BancreaPay.demoui.utils.PRINT_TYPE;
import com.BancreaPay.demoui.utils.Ticket;

public interface ITicket {
    void onPrintFinished(boolean isSuccess, PRINT_TYPE print_type, TicketLayoutType layoutType);

    void onPrintError(boolean isSuccess, String status, PRINT_TYPE print_type, TicketLayoutType layoutType);

    TicketLayoutType getPrintLayout();

    void setTicketData(Ticket ticket);
}
